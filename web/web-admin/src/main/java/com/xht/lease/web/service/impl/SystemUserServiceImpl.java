package com.xht.lease.web.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xht.lease.model.entity.SystemPost;
import com.xht.lease.model.entity.SystemUser;
import com.xht.lease.web.mapper.SystemPostMapper;
import com.xht.lease.web.service.SystemUserService;
import com.xht.lease.web.mapper.SystemUserMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xht.lease.web.vo.system.user.SystemUserItemVo;
import com.xht.lease.web.vo.system.user.SystemUserQueryVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liubo
 * @description 针对表【system_user(员工信息表)】的数据库操作Service实现
 * @createDate 2023-07-24 15:48:00
 */
@Service
public class SystemUserServiceImpl extends ServiceImpl<SystemUserMapper, SystemUser>
        implements SystemUserService {

    @Autowired
    private SystemPostMapper systemPostMapper;

    @Override
    public IPage<SystemUserItemVo> pageSystemUserByQuery(IPage<SystemUser> page, SystemUserQueryVo queryVo) {
        return baseMapper.pageSystemUserByQuery(page, queryVo);
    }

    @Override
    public SystemUserItemVo getSystemUserById(Long id) {
        SystemUser systemUser = baseMapper.selectById(id);

        SystemPost systemPost = systemPostMapper.selectById(systemUser.getPostId());

        SystemUserItemVo systemUserItemVo = new SystemUserItemVo();
        BeanUtils.copyProperties(systemPost, systemUserItemVo);
        systemUserItemVo.setPostName(systemUserItemVo.getPostName());

        return systemUserItemVo;
    }
}




