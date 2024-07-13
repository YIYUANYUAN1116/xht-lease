package com.xht.lease.web.mapper;

import com.xht.lease.model.entity.ApartmentFacility;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xht.lease.model.entity.FacilityInfo;

import java.util.List;

/**
* @author yzd
* @description 针对表【apartment_facility(公寓&配套关联表)】的数据库操作Mapper
* @createDate 2023-07-24 15:48:00
* @Entity com.xht.lease.model.ApartmentFacility
*/
public interface ApartmentFacilityMapper extends BaseMapper<ApartmentFacility> {

    List<FacilityInfo> selectListByApartmentId(Long id);
}




