package com.xht.lease.app.service;

public interface SmsService {
    void sendCode(String phone, String verifyCode);
}
