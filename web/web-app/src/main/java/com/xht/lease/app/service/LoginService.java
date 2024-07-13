package com.xht.lease.app.service;

import com.xht.lease.app.vo.user.LoginVo;
import com.xht.lease.app.vo.user.UserInfoVo;

public interface LoginService {
    void getSMSCode(String phone);

    String login(LoginVo loginVo);

    UserInfoVo getUserInfoById(Long userId);
}
