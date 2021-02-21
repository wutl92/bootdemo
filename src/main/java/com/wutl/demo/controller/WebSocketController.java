package com.wutl.demo.controller;

import com.wutl.demo.websocket.SocketClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wutl
 * @Title: websocket控制器
 * @Package
 * @Description:
 * @date 2021-2-69:09
 */
@RestController
@Slf4j
@RequestMapping("/my/websocket")
public class WebSocketController {


    @RequestMapping("/send")
    public void sendMessage(String msg){
        SocketClient.sendMessage("ws://192.168.11.183:9191/websocket/zsss",msg);
    }

}
