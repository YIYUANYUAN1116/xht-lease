package com.xht.lease.service;

import com.xht.lease.entity.ApartmentLabel;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xht.lease.entity.LabelInfo;

import java.util.List;

/**
* @author liubo
* @description 针对表【apartment_label(公寓标签关联表)】的数据库操作Service
* @createDate 2023-07-24 15:48:00
*/
public interface ApartmentLabelService extends IService<ApartmentLabel> {

    List<LabelInfo> selectListByApartmentId(Long id);
}
