package com.xht.lease.web.service;

import com.xht.lease.model.entity.ApartmentFacility;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xht.lease.model.entity.FacilityInfo;

import java.util.List;

/**
* @author liubo
* @description 针对表【apartment_facility(公寓&配套关联表)】的数据库操作Service
* @createDate 2023-07-24 15:48:00
*/
public interface ApartmentFacilityService extends IService<ApartmentFacility> {

    List<FacilityInfo> selectListByApartmentId(Long id);
}
