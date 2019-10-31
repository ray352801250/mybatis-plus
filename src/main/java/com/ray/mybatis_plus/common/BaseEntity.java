package com.ray.mybatis_plus.common;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Description:
 * @Author ray
 * @Date 2019/10/31 13:28
 * @Version
 **/
@Data
@ApiModel(value="ContractRecord对象", description="")
public class BaseEntity extends Wrapper<BaseEntity> {

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

    @Override
    public BaseEntity getEntity() {
        return null;
    }

    @Override
    public MergeSegments getExpression() {
        return null;
    }

    @Override
    public String getCustomSqlSegment() {
        return null;
    }

    @Override
    public String getSqlSegment() {
        return null;
    }
}
