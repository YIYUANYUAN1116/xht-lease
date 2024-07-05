package com.xht.lease.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xht.lease.model.entity.RoomPaymentType;
import com.xht.lease.web.service.RoomPaymentTypeService;
import com.xht.lease.web.mapper.RoomPaymentTypeMapper;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【room_payment_type(房间&支付方式关联表)】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class RoomPaymentTypeServiceImpl extends ServiceImpl<RoomPaymentTypeMapper, RoomPaymentType>
    implements RoomPaymentTypeService{

}




