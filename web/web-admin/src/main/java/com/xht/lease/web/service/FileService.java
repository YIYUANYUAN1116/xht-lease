package com.xht.lease.web.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {

    String upload(MultipartFile file) throws Exception;
}
