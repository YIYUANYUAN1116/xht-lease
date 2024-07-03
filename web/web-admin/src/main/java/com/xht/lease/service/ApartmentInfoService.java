package com.xht.lease.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xht.lease.entity.ApartmentInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xht.lease.vo.apartment.ApartmentDetailVo;
import com.xht.lease.vo.apartment.ApartmentItemVo;
import com.xht.lease.vo.apartment.ApartmentQueryVo;
import com.xht.lease.vo.apartment.ApartmentSubmitVo;

/**
* @author liubo
* @description 针对表【apartment_info(公寓信息表)】的数据库操作Service
* @createDate 2023-07-24 15:48:00
*/
public interface ApartmentInfoService extends IService<ApartmentInfo> {

    void saveOrUpdateApartment(ApartmentSubmitVo apartmentSubmitVo);

    IPage<ApartmentItemVo> pageApartmentItemByQuery(IPage<ApartmentItemVo> page, ApartmentQueryVo queryVo);

    ApartmentDetailVo getApartmentDetailById(Long id);

    void removeApartmentById(Long id);
}
