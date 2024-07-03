package com.xht.lease.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xht.lease.entity.ApartmentInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xht.lease.vo.apartment.ApartmentItemVo;
import com.xht.lease.vo.apartment.ApartmentQueryVo;

/**
* @author liubo
* @description 针对表【apartment_info(公寓信息表)】的数据库操作Mapper
* @createDate 2023-07-24 15:48:00
* @Entity com.xht.lease.model.ApartmentInfo
*/
public interface ApartmentInfoMapper extends BaseMapper<ApartmentInfo> {

    IPage<ApartmentItemVo> pageApartmentItemByQuery(IPage<ApartmentItemVo> page, ApartmentQueryVo queryVo);
}




