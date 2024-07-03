package com.xht.lease.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xht.lease.entity.ApartmentLabel;
import com.xht.lease.entity.LabelInfo;
import com.xht.lease.service.ApartmentLabelService;
import com.xht.lease.mapper.ApartmentLabelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author liubo
* @description 针对表【apartment_label(公寓标签关联表)】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class ApartmentLabelServiceImpl extends ServiceImpl<ApartmentLabelMapper, ApartmentLabel>
    implements ApartmentLabelService{

    @Override
    public List<LabelInfo> selectListByApartmentId(Long id) {
        return this.baseMapper.selectListByApartmentId(id);
    }
}




