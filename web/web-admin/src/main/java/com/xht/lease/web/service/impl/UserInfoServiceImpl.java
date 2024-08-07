package com.xht.lease.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xht.lease.model.entity.UserInfo;
import com.xht.lease.web.service.UserInfoService;
import com.xht.lease.web.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author yzd
* @description 针对表【user_info(用户信息表)】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
    implements UserInfoService {

}




