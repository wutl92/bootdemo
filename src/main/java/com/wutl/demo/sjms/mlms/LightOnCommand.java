package com.wutl.demo.sjms.mlms;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description: 命令
 * @date 2021-3-17 14:15
 */
public class LightOnCommand implements Command{

    public Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    /**
     * 执行命令
     */
    @Override
    public void execute() {
        light.on();
    }

}
