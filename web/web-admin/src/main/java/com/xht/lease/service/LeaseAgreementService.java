package com.xht.lease.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xht.lease.entity.LeaseAgreement;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xht.lease.vo.agreement.AgreementQueryVo;
import com.xht.lease.vo.agreement.AgreementVo;

/**
* @author liubo
* @description 针对表【lease_agreement(租约信息表)】的数据库操作Service
* @createDate 2023-07-24 15:48:00
*/
public interface LeaseAgreementService extends IService<LeaseAgreement> {

    IPage<AgreementVo> pageAgreementByQuery(IPage<AgreementVo> page, AgreementQueryVo queryVo);

    AgreementVo getAgreementById(Long id);
}
