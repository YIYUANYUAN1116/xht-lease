package com.xht.lease.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xht.lease.model.entity.PaymentType;
import com.xht.lease.web.service.PaymentTypeService;
import com.xht.lease.web.mapper.PaymentTypeMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author yzd
* @description 针对表【payment_type(支付方式表)】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class PaymentTypeServiceImpl extends ServiceImpl<PaymentTypeMapper, PaymentType>
    implements PaymentTypeService {

    @Override
    public List<PaymentType> selectListByRoomId(Long id) {
        return baseMapper.selectListByRoomId(id);
    }
}




