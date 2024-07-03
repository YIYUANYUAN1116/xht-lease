package com.xht.lease.service;

import com.xht.lease.entity.ApartmentFeeValue;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xht.lease.vo.fee.FeeValueVo;

import java.util.List;

/**
* @author liubo
* @description 针对表【apartment_fee_value(公寓&杂费关联表)】的数据库操作Service
* @createDate 2023-07-24 15:48:00
*/
public interface ApartmentFeeValueService extends IService<ApartmentFeeValue> {

    List<FeeValueVo> selectListByApartmentId(Long id);
}
