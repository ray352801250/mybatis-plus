package com.ray.mybatis_plus.bean.emp;

import java.util.Date;
import com.ray.mybatis_plus.common.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 灵工
 * </p>
 *
 * @author ray
 * @since 2019-10-31
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="Worker对象", description="灵工")
public class Worker extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "用户id")
    private Long userId;

    @ApiModelProperty(value = "手机号码")
    private String phoneNumber;

    @ApiModelProperty(value = "头像")
    private String avatarUrl;

    @ApiModelProperty(value = "出生日期")
    private Date birthday;

    @ApiModelProperty(value = "性别（0：未知，1：男，2：女）")
    private Integer gender;

    @ApiModelProperty(value = "证件号码（目前只有身份证）")
    private String idNo;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "来源渠道")
    private Long sourceChannelId;

    @ApiModelProperty(value = "员工类型 1 灵工 2 员工")
    private Integer type;

    @ApiModelProperty(value = "状态（0:未激活，1：已激活）")
    private Integer status;

    @ApiModelProperty(value = "是否在上上签注册(0:未注册 1:注册中 2:已注册)")
    private Integer bestsignRegistered;

    @ApiModelProperty(value = "是否禁用")
    private Integer disable;

    @ApiModelProperty(value = "删除标记")
    private Integer deleted;


}
