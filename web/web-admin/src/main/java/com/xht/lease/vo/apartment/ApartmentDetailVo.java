package com.xht.lease.vo.apartment;


import com.xht.lease.entity.ApartmentInfo;
import com.xht.lease.entity.FacilityInfo;
import com.xht.lease.entity.LabelInfo;
import com.xht.lease.vo.graph.GraphVo;
import com.xht.lease.vo.fee.FeeValueVo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Schema(description = "公寓信息")
@Data
public class ApartmentDetailVo extends ApartmentInfo {

    @Schema(description = "图片列表")
    private List<GraphVo> graphVoList;

    @Schema(description = "标签列表")
    private List<LabelInfo> labelInfoList;

    @Schema(description = "配套列表")
    private List<FacilityInfo> facilityInfoList;

    @Schema(description = "杂费列表")
    private List<FeeValueVo> feeValueVoList;

}