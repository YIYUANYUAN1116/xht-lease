package com.xht.lease.web.service.impl;

import com.xht.lease.common.properties.MinioProperties;
import com.xht.lease.web.service.FileService;
import io.minio.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Service
@Slf4j
public class FileServiceImpl implements FileService {

    @Autowired
    private MinioClient minioClient;

    @Autowired
    private MinioProperties properties;

    @Override
    public String upload(MultipartFile file) throws Exception {
        try {
            boolean bucketExists = minioClient.bucketExists(BucketExistsArgs.builder().bucket(properties.getBucketName()).build());
            if (!bucketExists){
                minioClient.makeBucket(MakeBucketArgs.builder().bucket(properties.getBucketName()).build());
                minioClient.setBucketPolicy(SetBucketPolicyArgs.builder().bucket(properties.getBucketName())
                        .config(createBucketPolicyConfig(properties.getBucketName())).build());
            }

            String filename = new SimpleDateFormat("yyyyMMdd").format(new Date()) + "/" + UUID.randomUUID() + "-" + file.getOriginalFilename();

            minioClient.putObject(PutObjectArgs.builder().bucket(properties.getBucketName())
                    .object(filename)
                    .stream(file.getInputStream(),file.getSize(),-1)
                    .contentType(file.getContentType()).build());
            return String.join("/", properties.getEndpoint(), properties.getBucketName(), filename);
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new Exception(e);
        }
    }

    private String createBucketPolicyConfig(String bucketName) {
        return """
            {
              "Statement" : [ {
                "Action" : "s3:GetObject",
                "Effect" : "Allow",
                "Principal" : "*",
                "Resource" : "arn:aws:s3:::%s/*"
              } ],
              "Version" : "2012-10-17"
            }
            """.formatted(bucketName);
    }
}
