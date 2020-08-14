package com.erp.domain.usercenter;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 角色权限
 * </p>
 *
 * @author myJava
 * @since 2020-08-12
 */
@Data
@ApiModel(value="MgtRolePermission对象", description="角色权限")
public class MgtRolePermission implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String roleId;

    private String permissionId;

    @ApiModelProperty(value = "逻辑删除 1（true）已删除， 0（false）未删除")
    private Boolean isDeleted;


}
