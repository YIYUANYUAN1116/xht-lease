package com.xht.lease.app.service;

import com.xht.lease.app.vo.appointment.AppointmentDetailVo;
import com.xht.lease.app.vo.appointment.AppointmentItemVo;
import com.xht.lease.model.entity.ViewAppointment;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author yzd
* @description 针对表【view_appointment(预约看房信息表)】的数据库操作Service
* @createDate 2023-07-26 11:12:39
*/
public interface ViewAppointmentService extends IService<ViewAppointment> {
    List<AppointmentItemVo> listItemByUserId(Long userId);

    AppointmentDetailVo getDetailById(Long id);
}
