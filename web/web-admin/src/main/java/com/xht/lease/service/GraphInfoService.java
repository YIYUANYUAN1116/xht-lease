package com.xht.lease.service;

import com.xht.lease.entity.GraphInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xht.lease.enums.ItemType;
import com.xht.lease.vo.graph.GraphVo;

import java.util.List;

/**
* @author liubo
* @description 针对表【graph_info(图片信息表)】的数据库操作Service
* @createDate 2023-07-24 15:48:00
*/
public interface GraphInfoService extends IService<GraphInfo> {

    List<GraphVo> selectListByItemTypeAndId(ItemType itemType, Long id);
}
