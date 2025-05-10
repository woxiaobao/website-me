package org.start.app.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.start.app.dto.CustomerMessageDTO;
import org.start.app.dto.MessageResponse;
import org.start.app.service.DingTalkService;

@Tag(name = "钉钉机器人接口", description = "钉钉机器人消息发送相关接口")
@RestController
@RequestMapping("/api/dingtalk")
public class DingTalkController {

    @Autowired
    private DingTalkService dingTalkService;

    // @Operation(summary = "发送钉钉消息")
    // @PostMapping("/send")
    // public boolean sendMessage(@RequestParam String content) {
    // return dingTalkService.sendMessage(content);
    // }

    @Operation(summary = "发送客户信息钉钉消息", description = "发送包含公司名称、客户名称、客户电话和客户需求的钉钉消息")
    @PostMapping("/send/customer")
    public MessageResponse sendCustomerMessage(@RequestBody @Validated CustomerMessageDTO customerMessage) {
        return dingTalkService.sendCustomerMessage(customerMessage);
    }
}