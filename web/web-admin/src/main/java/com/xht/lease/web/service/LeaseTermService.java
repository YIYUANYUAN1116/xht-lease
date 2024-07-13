package com.xht.lease.web.service;

import com.xht.lease.model.entity.LeaseTerm;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author yzd
* @description 针对表【lease_term(租期)】的数据库操作Service
* @createDate 2023-07-24 15:48:00
*/
public interface LeaseTermService extends IService<LeaseTerm> {

    List<LeaseTerm> selectListByRoomId(Long id);
}
