package com.xht.lease.app.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xht.lease.app.vo.room.RoomDetailVo;
import com.xht.lease.app.vo.room.RoomItemVo;
import com.xht.lease.app.vo.room.RoomQueryVo;
import com.xht.lease.model.entity.RoomInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author yzd
* @description 针对表【room_info(房间信息表)】的数据库操作Service
* @createDate 2023-07-26 11:12:39
*/
public interface RoomInfoService extends IService<RoomInfo> {
    IPage<RoomItemVo> pageRoomItemByQuery(Page<RoomItemVo> page, RoomQueryVo queryVo);

    RoomDetailVo getDetailById(Long id);

    IPage<RoomItemVo> pageItemByApartmentId(IPage<RoomItemVo> page, Long id);
}
