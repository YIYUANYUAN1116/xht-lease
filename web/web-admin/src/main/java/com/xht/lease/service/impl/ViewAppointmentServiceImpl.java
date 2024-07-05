package com.xht.lease.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xht.lease.entity.ViewAppointment;
import com.xht.lease.mapper.ViewAppointmentMapper;
import com.xht.lease.service.ViewAppointmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xht.lease.vo.appointment.AppointmentQueryVo;
import com.xht.lease.vo.appointment.AppointmentVo;
import org.springframework.stereotype.Service;

/**
 * @author liubo
 * @description 针对表【view_appointment(预约看房信息表)】的数据库操作Service实现
 * @createDate 2023-07-24 15:48:00
 */
@Service
public class ViewAppointmentServiceImpl extends ServiceImpl<ViewAppointmentMapper, ViewAppointment>
        implements ViewAppointmentService {

    @Override
    public IPage<AppointmentVo> pageAppointmentByQuery(IPage<AppointmentVo> page, AppointmentQueryVo queryVo) {
        return baseMapper.pageAppointmentByQuery(page,queryVo);
    }
}




