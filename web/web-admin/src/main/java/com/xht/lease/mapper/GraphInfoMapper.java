package com.xht.lease.mapper;

import com.xht.lease.entity.GraphInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xht.lease.enums.ItemType;
import com.xht.lease.vo.graph.GraphVo;

import java.util.List;

/**
* @author liubo
* @description 针对表【graph_info(图片信息表)】的数据库操作Mapper
* @createDate 2023-07-24 15:48:00
* @Entity com.xht.lease.model.GraphInfo
*/
public interface GraphInfoMapper extends BaseMapper<GraphInfo> {

    List<GraphVo> selectListByItemTypeAndId(ItemType itemType, Long itemId);
}




