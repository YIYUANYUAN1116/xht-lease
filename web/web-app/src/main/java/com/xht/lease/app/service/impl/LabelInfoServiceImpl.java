package com.xht.lease.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xht.lease.model.entity.LabelInfo;
import com.xht.lease.app.service.LabelInfoService;
import com.xht.lease.app.mapper.LabelInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author yzd
* @description 针对表【label_info(标签信息表)】的数据库操作Service实现
* @createDate 2023-07-26 11:12:39
*/
@Service
public class LabelInfoServiceImpl extends ServiceImpl<LabelInfoMapper, LabelInfo>
    implements LabelInfoService{

}




