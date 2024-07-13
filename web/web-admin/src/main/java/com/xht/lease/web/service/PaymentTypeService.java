package com.xht.lease.web.service;

import com.xht.lease.model.entity.PaymentType;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author yzd
* @description 针对表【payment_type(支付方式表)】的数据库操作Service
* @createDate 2023-07-24 15:48:00
*/
public interface PaymentTypeService extends IService<PaymentType> {

    List<PaymentType> selectListByRoomId(Long id);
}
