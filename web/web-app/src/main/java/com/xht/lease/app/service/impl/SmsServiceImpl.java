package com.xht.lease.app.service.impl;

import com.xht.lease.app.service.SmsService;
import org.springframework.stereotype.Service;

@Service
public class SmsServiceImpl implements SmsService {

    @Override
    public void sendCode(String phone, String verifyCode) {
//        SendSmsRequest smsRequest = new SendSmsRequest();
//        smsRequest.setPhoneNumbers(phone);
//        smsRequest.setSignName("阿里云短信测试");
//        smsRequest.setTemplateCode("SMS_154950909");
//        smsRequest.setTemplateParam("{\"code\":\"" + verifyCode + "\"}");
//        try {
//            client.sendSms(smsRequest);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
    }
}
