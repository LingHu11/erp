package com.erp.domain.usercenter;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 权限
 * </p>
 *
 * @author myJava
 * @since 2020-08-12
 */
@Data

@ApiModel(value="MgtPermission对象", description="权限")
public class MgtPermission implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "编号")
    private String id;

    @ApiModelProperty(value = "父级id")
    private String pid;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "类型(1:菜单,2:按钮)")
    private Integer type;

    @ApiModelProperty(value = "权限值")
    private String permissionValue;

    @ApiModelProperty(value = "访问路径")
    private String path;

    @ApiModelProperty(value = "状态(0:禁止,1:正常)")
    private Integer status;

    @ApiModelProperty(value = "逻辑删除 1（true）已删除， 0（false）未删除")
    private Boolean isDeleted;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "更新时间")
    private Date gmtModified;


}
