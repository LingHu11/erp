package com.erp.domain.usercenter;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 部门
 * </p>
 *
 * @author myJava
 * @since 2020-08-12
 */
@Data
@ApiModel(value="MgtPosition对象", description="职位")
public class MgtPosition implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "职位id")
    private String id;

    @ApiModelProperty(value = "职位名称")
    private String positionname;

    @ApiModelProperty(value = "逻辑删除 1（true）已删除， 0（false）未删除")
    private Boolean isDeleted;

}
