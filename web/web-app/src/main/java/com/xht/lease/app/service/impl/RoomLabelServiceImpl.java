package com.xht.lease.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xht.lease.model.entity.RoomLabel;
import com.xht.lease.app.service.RoomLabelService;
import com.xht.lease.app.mapper.RoomLabelMapper;
import org.springframework.stereotype.Service;

/**
* @author yzd
* @description 针对表【room_label(房间&标签关联表)】的数据库操作Service实现
* @createDate 2023-07-26 11:12:39
*/
@Service
public class RoomLabelServiceImpl extends ServiceImpl<RoomLabelMapper, RoomLabel>
    implements RoomLabelService{

}




