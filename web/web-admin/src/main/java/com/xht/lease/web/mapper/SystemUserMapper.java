package com.xht.lease.web.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xht.lease.model.entity.SystemUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xht.lease.web.vo.system.user.SystemUserItemVo;
import com.xht.lease.web.vo.system.user.SystemUserQueryVo;

/**
* @author yzd
* @description 针对表【system_user(员工信息表)】的数据库操作Mapper
* @createDate 2023-07-24 15:48:00
* @Entity com.xht.lease.model.SystemUser
*/
public interface SystemUserMapper extends BaseMapper<SystemUser> {

    IPage<SystemUserItemVo> pageSystemUserByQuery(IPage<SystemUser> page, SystemUserQueryVo queryVo);

    SystemUser selectOneByUsername(String username);
}




