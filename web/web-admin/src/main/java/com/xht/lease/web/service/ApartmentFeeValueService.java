package com.xht.lease.web.service;

import com.xht.lease.model.entity.ApartmentFeeValue;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xht.lease.web.vo.fee.FeeValueVo;

import java.util.List;

/**
* @author yzd
* @description 针对表【apartment_fee_value(公寓&杂费关联表)】的数据库操作Service
* @createDate 2023-07-24 15:48:00
*/
public interface ApartmentFeeValueService extends IService<ApartmentFeeValue> {

    List<FeeValueVo> selectListByApartmentId(Long id);
}
