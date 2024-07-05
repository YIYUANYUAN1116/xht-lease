package com.xht.lease.service;

import com.xht.lease.vo.login.CaptchaVo;
import com.xht.lease.vo.login.LoginVo;
import com.xht.lease.vo.system.user.SystemUserInfoVo;

public interface LoginService {

    CaptchaVo getCaptcha();

    String login(LoginVo loginVo);

    SystemUserInfoVo getLoginUserInfo(Long userId);
}
