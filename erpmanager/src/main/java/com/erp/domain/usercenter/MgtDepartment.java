package com.erp.domain.usercenter;



import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 部门
 * </p>
 *
 * @author myJava
 * @since 2020-08-12
 */
@Data
@ApiModel(value="MgtDepartment对象", description="部门")
public class MgtDepartment implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "部门id")
    private String id;

    @ApiModelProperty(value = "部门名称")
    private String departname;

    @ApiModelProperty(value = "逻辑删除 1（true）已删除， 0（false）未删除")
    private Boolean isDeleted;

}
