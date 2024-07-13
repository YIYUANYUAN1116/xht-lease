package com.xht.lease.web.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xht.lease.model.entity.SystemUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xht.lease.web.vo.system.user.SystemUserItemVo;
import com.xht.lease.web.vo.system.user.SystemUserQueryVo;

/**
* @author yzd
* @description 针对表【system_user(员工信息表)】的数据库操作Service
* @createDate 2023-07-24 15:48:00
*/
public interface SystemUserService extends IService<SystemUser> {

    IPage<SystemUserItemVo> pageSystemUserByQuery(IPage<SystemUser> page, SystemUserQueryVo queryVo);

    SystemUserItemVo getSystemUserById(Long id);
}
