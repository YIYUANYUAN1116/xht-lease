package com.xht.lease.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xht.lease.model.entity.AttrValue;
import com.xht.lease.web.service.AttrValueService;
import com.xht.lease.web.mapper.AttrValueMapper;
import com.xht.lease.web.vo.attr.AttrValueVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author yzd
* @description 针对表【attr_value(房间基本属性值表)】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class AttrValueServiceImpl extends ServiceImpl<AttrValueMapper, AttrValue>
    implements AttrValueService {

    @Override
    public List<AttrValueVo> selectListByRoomId(Long id) {
        return baseMapper.selectListByRoomId(id);
    }
}




