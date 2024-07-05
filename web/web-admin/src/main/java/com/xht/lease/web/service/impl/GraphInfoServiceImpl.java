package com.xht.lease.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xht.lease.model.enums.ItemType;
import com.xht.lease.web.mapper.GraphInfoMapper;
import com.xht.lease.web.service.GraphInfoService;
import com.xht.lease.model.entity.GraphInfo;
import com.xht.lease.web.vo.graph.GraphVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author liubo
* @description 针对表【graph_info(图片信息表)】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class GraphInfoServiceImpl extends ServiceImpl<GraphInfoMapper, GraphInfo>
    implements GraphInfoService {

    @Override
    public List<GraphVo> selectListByItemTypeAndId(ItemType itemType, Long itemId) {
        return this.baseMapper.selectListByItemTypeAndId(itemType,itemId);
    }
}




