package com.aision.iot.platform.location.server.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yim
 * @description 调用websocket发送消息
 * @date 2019/5/7
 */
@FeignClient(value = "iot-platform-websocket")
public interface WebSocketFeign {


    /**
     * 发送websocket消息
     * @param msg 消息内容
     * @param target websocket连接
     * @return
     */
    @GetMapping("/websocketApi/sendMessage")
    void sendMessage(@RequestParam("msg") String msg, @RequestParam("target") String target);

}
