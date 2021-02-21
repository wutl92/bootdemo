package com.wutl.demo.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description:
 * @date 2021-2-21 13:45
 */
@Component
public class CStartEventHandler implements ApplicationListener<ContextStartedEvent> {
    @Override
    public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
        System.out.println("CStartEventHandler...");
    }
}
