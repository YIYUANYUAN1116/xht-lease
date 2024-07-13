package com.xht.lease.web.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xht.lease.model.entity.ViewAppointment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xht.lease.web.vo.appointment.AppointmentQueryVo;
import com.xht.lease.web.vo.appointment.AppointmentVo;

/**
* @author yzd
* @description 针对表【view_appointment(预约看房信息表)】的数据库操作Mapper
* @createDate 2023-07-24 15:48:00
* @Entity com.xht.lease.model.ViewAppointment
*/
public interface ViewAppointmentMapper extends BaseMapper<ViewAppointment> {

    IPage<AppointmentVo> pageAppointmentByQuery(IPage<AppointmentVo> page, AppointmentQueryVo queryVo);
}




