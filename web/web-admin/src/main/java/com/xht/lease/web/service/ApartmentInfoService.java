package com.xht.lease.web.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xht.lease.model.entity.ApartmentInfo;
import com.xht.lease.web.vo.apartment.ApartmentDetailVo;
import com.xht.lease.web.vo.apartment.ApartmentItemVo;
import com.xht.lease.web.vo.apartment.ApartmentQueryVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xht.lease.web.vo.apartment.ApartmentSubmitVo;

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
