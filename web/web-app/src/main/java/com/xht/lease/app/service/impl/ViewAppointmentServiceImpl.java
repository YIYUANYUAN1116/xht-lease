package com.xht.lease.app.service.impl;

import com.xht.lease.app.service.ApartmentInfoService;
import com.xht.lease.app.vo.apartment.ApartmentItemVo;
import com.xht.lease.app.vo.appointment.AppointmentDetailVo;
import com.xht.lease.app.vo.appointment.AppointmentItemVo;
import com.xht.lease.model.entity.ViewAppointment;
import com.xht.lease.app.mapper.ViewAppointmentMapper;
import com.xht.lease.app.service.ViewAppointmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yzd
 * @description 针对表【view_appointment(预约看房信息表)】的数据库操作Service实现
 * @createDate 2023-07-26 11:12:39
 */
@Service
public class ViewAppointmentServiceImpl extends ServiceImpl<ViewAppointmentMapper, ViewAppointment>
        implements ViewAppointmentService {

    @Autowired
    private ApartmentInfoService apartmentInfoService;
    @Override
    public List<AppointmentItemVo> listItemByUserId(Long userId) {
        return baseMapper.listItemByUserId(userId);
    }

    @Override
    public AppointmentDetailVo getDetailById(Long id) {
        ViewAppointment viewAppointment = baseMapper.selectById(id);

        ApartmentItemVo apartmentItemVo = apartmentInfoService.selectApartmentItemVoById(viewAppointment.getApartmentId());

        AppointmentDetailVo agreementDetailVo = new AppointmentDetailVo();
        BeanUtils.copyProperties(viewAppointment, agreementDetailVo);

        agreementDetailVo.setApartmentItemVo(apartmentItemVo);

        return agreementDetailVo;
    }
}




