package com.erp.domain.usercenter;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author myJava
 * @since 2020-08-12
 */
@Data
@ApiModel(value="MgtUser对象", description="用户表")
public class MgtUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private String id;

    @ApiModelProperty(value = "部门id")
    private String departId;

    @ApiModelProperty(value = "上级id")
    private String superId;

    @ApiModelProperty(value = "职位id")
    private String positionId;

    @ApiModelProperty(value = "账号名称")
    private String username;

    @ApiModelProperty(value = "真实名称")
    private String realName;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "手机号")
    private String phone;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "用户头像")
    private String avatar;

    @ApiModelProperty(value = "用户签名")
    private String token;

    @ApiModelProperty(value = "逻辑删除 1（true）已删除， 0（false）未删除")
    private Boolean isDeleted;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @ApiModelProperty(value = "更新时间")
    private Date gmtModified;


}
