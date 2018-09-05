package com.api.dto.clinic;


import com.api.dto.parentDto.ParentDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 门诊缴单明细查询
 */
@ApiModel(value="门诊缴单明细查询参数对象",description="门诊缴单明细查询参数对象")
public class ClinicBillDetailQueryDto extends ParentDto {
    //账号id
    @ApiModelProperty(name="out_platform_id",value="账号id",example="2088990",required =true)
    @NotEmpty(message = "账号id不能为空")
    private String out_platform_id;
    //渠道
    @ApiModelProperty(name="channel",value="渠道",example="10",required =true)
    @NotEmpty(message = "渠道不能为空")
    private String channel;
    //身份证
    @ApiModelProperty(name="idcard_no",value="身份证",example="512039199009170988",required =true)
    @NotEmpty(message = "身份证不能为空")
    private String idcard_no;
    //费用单据号
    @ApiModelProperty(name="receiptNo",value="费用单据号(HIS系统内部单据唯一号)",example="2343243",required =true)
    @NotEmpty(message = "receiptNo")
    private String receiptNo;

    public String getOut_platform_id() {
        return out_platform_id;
    }

    public void setOut_platform_id(String out_platform_id) {
        this.out_platform_id = out_platform_id;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getIdcard_no() {
        return idcard_no;
    }

    public void setIdcard_no(String idcard_no) {
        this.idcard_no = idcard_no;
    }

    public String getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }
}
