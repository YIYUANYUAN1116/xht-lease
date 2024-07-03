package com.xht.lease.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xht.lease.entity.ApartmentFacility;
import com.xht.lease.entity.FacilityInfo;
import com.xht.lease.service.ApartmentFacilityService;
import com.xht.lease.mapper.ApartmentFacilityMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author liubo
* @description 针对表【apartment_facility(公寓&配套关联表)】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class ApartmentFacilityServiceImpl extends ServiceImpl<ApartmentFacilityMapper, ApartmentFacility>
    implements ApartmentFacilityService{

    @Override
    public List<FacilityInfo> selectListByApartmentId(Long id) {
        return this.baseMapper.selectListByApartmentId(id);
    }
}




