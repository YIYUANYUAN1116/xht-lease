package com.xht.lease.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xht.lease.model.entity.FacilityInfo;
import com.xht.lease.web.service.FacilityInfoService;
import com.xht.lease.web.mapper.FacilityInfoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author yzd
* @description 针对表【facility_info(配套信息表)】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class FacilityInfoServiceImpl extends ServiceImpl<FacilityInfoMapper, FacilityInfo>
    implements FacilityInfoService {

    @Override
    public List<FacilityInfo> selectListByRoomId(Long id) {
        return baseMapper.selectListByRoomId(id);
    }
}




