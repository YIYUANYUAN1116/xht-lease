package com.xht.lease.web.service.impl;

import com.xht.lease.model.entity.AttrKey;
import com.xht.lease.web.service.AttrKeyService;
import com.xht.lease.web.mapper.AttrKeyMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xht.lease.web.vo.attr.AttrKeyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author yzd
* @description 针对表【attr_key(房间基本属性表)】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class AttrKeyServiceImpl extends ServiceImpl<AttrKeyMapper, AttrKey>
    implements AttrKeyService {
    @Autowired
    private AttrKeyMapper mapper;
    @Override
    public List<AttrKeyVo> listAttrInfo() {
        return mapper.listAttrInfo();
    }
}




