package com.erp.domain.usercenter;


import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author myJava
 * @since 2020-08-12
 */
@Data
@ApiModel(value="MgtUserRole对象", description="")
public class MgtUserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键id")
    private String id;

    @ApiModelProperty(value = "角色id")
    private String roleId;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "逻辑删除 1（true）已删除， 0（false）未删除")
    private Boolean isDeleted;


}
