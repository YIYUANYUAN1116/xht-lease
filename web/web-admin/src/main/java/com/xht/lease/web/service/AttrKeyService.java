package com.xht.lease.web.service;

import com.xht.lease.model.entity.AttrKey;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xht.lease.web.vo.attr.AttrKeyVo;

import java.util.List;

/**
* @author yzd
* @description 针对表【attr_key(房间基本属性表)】的数据库操作Service
* @createDate 2023-07-24 15:48:00
*/
public interface AttrKeyService extends IService<AttrKey> {

    List<AttrKeyVo> listAttrInfo();
}
