package com.xht.lease.web.service;

import com.xht.lease.web.vo.login.CaptchaVo;
import com.xht.lease.web.vo.login.LoginVo;
import com.xht.lease.web.vo.system.user.SystemUserInfoVo;

public interface LoginService {

    CaptchaVo getCaptcha();

    String login(LoginVo loginVo);

    SystemUserInfoVo getLoginUserInfo(Long userId);
}
