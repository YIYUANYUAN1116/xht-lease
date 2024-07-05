package com.xht.lease.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xht.lease.entity.ViewAppointment;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xht.lease.vo.appointment.AppointmentQueryVo;
import com.xht.lease.vo.appointment.AppointmentVo;

/**
* @author liubo
* @description 针对表【view_appointment(预约看房信息表)】的数据库操作Service
* @createDate 2023-07-24 15:48:00
*/
public interface ViewAppointmentService extends IService<ViewAppointment> {

    IPage<AppointmentVo> pageAppointmentByQuery(IPage<AppointmentVo> page, AppointmentQueryVo queryVo);
}
