package com.xht.lease.service.impl;

import com.xht.lease.entity.FeeKey;
import com.xht.lease.service.FeeKeyService;
import com.xht.lease.mapper.FeeKeyMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xht.lease.vo.fee.FeeKeyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author liubo
* @description 针对表【fee_key(杂项费用名称表)】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class FeeKeyServiceImpl extends ServiceImpl<FeeKeyMapper, FeeKey>
    implements FeeKeyService {
    @Autowired
    private FeeKeyMapper mapper;
    @Override
    public List<FeeKeyVo> listFeeInfo() {
        return mapper.listFeeInfo();
    }
}




