package org.start.app.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 消息发送响应DTO
 */
@Data
@Schema(description = "消息发送响应对象")
public class MessageResponse {

    /**
     * 状态码
     */
    @Schema(description = "状态码", example = "200")
    private Integer code;

    /**
     * 结果
     */
    @Schema(description = "结果", example = "true")
    private Boolean success;

    /**
     * 失败原因
     */
    @Schema(description = "失败原因", example = "签名验证失败")
    private String errorMessage;

    /**
     * 创建成功响应
     * 
     * @return 成功响应对象
     */
    public static MessageResponse success() {
        MessageResponse response = new MessageResponse();
        response.setCode(200);
        response.setSuccess(true);
        return response;
    }

    /**
     * 创建失败响应
     * 
     * @param code         错误码
     * @param errorMessage 错误信息
     * @return 失败响应对象
     */
    public static MessageResponse fail(Integer code, String errorMessage) {
        MessageResponse response = new MessageResponse();
        response.setCode(code);
        response.setSuccess(false);
        response.setErrorMessage(errorMessage);
        return response;
    }
}