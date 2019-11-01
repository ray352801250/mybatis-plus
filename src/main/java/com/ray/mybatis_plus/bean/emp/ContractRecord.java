package com.ray.mybatis_plus.bean.emp;

import com.ray.mybatis_plus.common.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ray
 * @since 2019-11-01
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="ContractRecord对象", description="")
public class ContractRecord extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "组织id")
    private Long companyOrgId;

    @ApiModelProperty(value = "灵工id")
    private Long workerId;

    @ApiModelProperty(value = "合同编号")
    private String contractNo;

    @ApiModelProperty(value = "签约状态(0:待签署 1:签署中 2:甲方已签署 3:乙方已签署 4:已完成)")
    private Integer status;


}
