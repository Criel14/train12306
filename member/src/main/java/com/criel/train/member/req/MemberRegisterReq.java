package com.criel.train.member.req;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

/**
 * (封装请求参数，相当于VO)
 * 用户注册请求
 */
@Data
public class MemberRegisterReq {
    @NotBlank(message = "手机号不能为空")
    @Pattern(regexp="^1\\d{10}$", message ="手机号码格式错误")
    String mobile;
}
