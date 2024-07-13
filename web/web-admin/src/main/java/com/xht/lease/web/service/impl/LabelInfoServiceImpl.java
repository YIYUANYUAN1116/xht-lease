package com.xht.lease.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xht.lease.model.entity.LabelInfo;
import com.xht.lease.web.service.LabelInfoService;
import com.xht.lease.web.mapper.LabelInfoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author yzd
* @description 针对表【label_info(标签信息表)】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class LabelInfoServiceImpl extends ServiceImpl<LabelInfoMapper, LabelInfo>
    implements LabelInfoService {

    @Override
    public List<LabelInfo> selectListByRoomId(Long id) {
        return baseMapper.selectListByRoomId(id);
    }
}




