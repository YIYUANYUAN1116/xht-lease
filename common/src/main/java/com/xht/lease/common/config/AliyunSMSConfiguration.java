package com.xht.lease.common.config;

import com.xht.lease.common.properties.AliyunSMSProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : YIYUANYUAN
 * @date: 2024/7/13  13:22
 */
@Configuration
@EnableConfigurationProperties(AliyunSMSProperties.class)
@ConditionalOnProperty(name = "aliyun.sms.endpoint")
public class AliyunSMSConfiguration {
    @Autowired
    private AliyunSMSProperties properties;


//    @Bean
//    public Client smsClient() {
//        Config config = new Config();
//        config.setAccessKeyId(properties.getAccessKeyId());
//        config.setAccessKeySecret(properties.getAccessKeySecret());
//        config.setEndpoint(properties.getEndpoint());
//        try {
//            return new Client(config);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//    }
}
