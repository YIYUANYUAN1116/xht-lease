package com.xht.lease.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xht.lease.entity.GraphInfo;
import com.xht.lease.service.GraphInfoService;
import com.xht.lease.mapper.GraphInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【graph_info(图片信息表)】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class GraphInfoServiceImpl extends ServiceImpl<GraphInfoMapper, GraphInfo>
    implements GraphInfoService {

}



