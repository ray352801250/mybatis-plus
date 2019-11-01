package com.ray.mybatis_plus.bean.emp;

import com.ray.mybatis_plus.common.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel(value="CompanyTemplate对象", description="")
public class CompanyTemplate extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "组织id")
    private Long companyOrgId;

    @ApiModelProperty(value = "模板编号")
    private String templateNo;

    @ApiModelProperty(value = "生成的合同多少秒后过期")
    private Long expireTime;

    @ApiModelProperty(value = "合同标题")
    private String title;

    @ApiModelProperty(value = "合同描述")
    private String description;

    @ApiModelProperty(value = "签名图片名称")
    private String signatureImageName;


}
