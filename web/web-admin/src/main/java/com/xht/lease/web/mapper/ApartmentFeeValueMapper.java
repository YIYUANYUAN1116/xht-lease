package com.xht.lease.web.mapper;

import com.xht.lease.model.entity.ApartmentFeeValue;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xht.lease.web.vo.fee.FeeValueVo;

import java.util.List;

/**
* @author yzd
* @description 针对表【apartment_fee_value(公寓&杂费关联表)】的数据库操作Mapper
* @createDate 2023-07-24 15:48:00
* @Entity com.xht.lease.model.ApartmentFeeValue
*/
public interface ApartmentFeeValueMapper extends BaseMapper<ApartmentFeeValue> {

    List<FeeValueVo> selectListByApartmentId(Long id);
}




