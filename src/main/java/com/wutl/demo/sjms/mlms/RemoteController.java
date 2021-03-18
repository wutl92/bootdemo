package com.wutl.demo.sjms.mlms;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description: 命令模式，动作的发起者，与动作的执行者解耦，由命令来执行。
 * @date 2021-3-17 14:23
 */
public class RemoteController {

    public static void main(String[] args) {
        // 创建命令，参数是命令执行的对象
        Command command = new LightOnCommand(new Light());
        // 创建控制器
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        // 控制器设置获取命令。
        simpleRemoteControl.setCommand(command);
        // 控制器执行操作，执行命令。
        simpleRemoteControl.buttonWasPressed();
    }

}
