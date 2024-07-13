package com.xht.lease.web.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xht.lease.model.entity.RoomInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xht.lease.web.vo.room.RoomDetailVo;
import com.xht.lease.web.vo.room.RoomItemVo;
import com.xht.lease.web.vo.room.RoomQueryVo;
import com.xht.lease.web.vo.room.RoomSubmitVo;

/**
* @author yzd
* @description 针对表【room_info(房间信息表)】的数据库操作Service
* @createDate 2023-07-24 15:48:00
*/
public interface RoomInfoService extends IService<RoomInfo> {

    void saveOrUpdateRoom(RoomSubmitVo roomSubmitVo);

    IPage<RoomItemVo> pageRoomItemByQuery(IPage<RoomItemVo> page, RoomQueryVo queryVo);

    RoomDetailVo getRoomDetailById(Long id);

    void removeRoomById(Long id);
}
