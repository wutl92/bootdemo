package com.wutl.demo.sjms.mlms;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description:
 * @date 2021-3-17 14:24
 */
public class SimpleRemoteControl {

    Command command;

    void setCommand(Command command){
        this.command = command;
    }

    void buttonWasPressed(){
        command.execute();
    }
}
