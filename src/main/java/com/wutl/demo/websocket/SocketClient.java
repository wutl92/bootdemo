package com.wutl.demo.websocket;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import java.net.URI;

/**
 * @author wutl
 * @Title: 客户端
 * @Package
 * @Description:
 * @date 2021-2-69:07
 */
public class SocketClient extends WebSocketClient {

    public SocketClient(URI serverUri) {
        super(serverUri);
    }

    @Override
    public void onOpen(ServerHandshake serverHandshake) {
        System.out.println("客户端连接成功！");
    }

    @Override
    public void onMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void onClose(int i, String message, boolean b) {

    }

    @Override
    public void onError(Exception e) {

    }

    public static void  sendMessage(String wsaddress, String msg){
        try {
            URI uri = new URI(wsaddress);
            SocketClient client = new SocketClient(uri);
            client.connect();
            //每0.5秒检测一次连接状态。
           /* while (!client.getReadyState().equals(SocketClient.READYSTATE.OPEN)) {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
            System.out.println("建立websocket连接");*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
