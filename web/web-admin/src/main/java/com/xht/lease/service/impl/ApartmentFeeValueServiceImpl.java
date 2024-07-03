package com.xht.lease.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xht.lease.entity.ApartmentFeeValue;
import com.xht.lease.service.ApartmentFeeValueService;
import com.xht.lease.mapper.ApartmentFeeValueMapper;
import com.xht.lease.vo.fee.FeeValueVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author liubo
* @description 针对表【apartment_fee_value(公寓&杂费关联表)】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class ApartmentFeeValueServiceImpl extends ServiceImpl<ApartmentFeeValueMapper, ApartmentFeeValue>
    implements ApartmentFeeValueService{

    @Override
    public List<FeeValueVo> selectListByApartmentId(Long id) {
        return this.baseMapper.selectListByApartmentId(id);
    }
}




