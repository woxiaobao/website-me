package org.start.app.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * 客户信息消息DTO
 */
@Data
@Schema(description = "客户信息消息请求对象")
public class CustomerMessageDTO {

    /**
     * 公司名称
     */
    @NotBlank(message = "公司名称不能为空")
    @Schema(description = "公司名称", required = true)
    private String companyName;

    /**
     * 客户名称
     */
    @NotBlank(message = "客户名称不能为空")
    @Schema(description = "客户名称", required = true)
    private String customerName;

    /**
     * 客户电话
     * 验证手机号格式
     */
    @NotBlank(message = "客户电话不能为空")
    @Pattern(regexp = "^1[3-9]\\d{9}$", message = "手机号格式不正确")
    @Schema(description = "客户电话", required = true)
    private String customerPhone;

    /**
     * 客户需求
     */
    @NotBlank(message = "客户需求不能为空")
    @Schema(description = "客户需求", required = true)
    private String customerRequirement;
}