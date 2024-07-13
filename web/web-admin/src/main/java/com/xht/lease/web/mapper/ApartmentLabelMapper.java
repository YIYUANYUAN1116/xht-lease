package com.xht.lease.web.mapper;

import com.xht.lease.model.entity.LabelInfo;
import com.xht.lease.model.entity.ApartmentLabel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author yzd
* @description 针对表【apartment_label(公寓标签关联表)】的数据库操作Mapper
* @createDate 2023-07-24 15:48:00
* @Entity com.xht.lease.model.ApartmentLabel
*/
public interface ApartmentLabelMapper extends BaseMapper<ApartmentLabel> {

    List<LabelInfo> selectListByApartmentId(Long id);
}




