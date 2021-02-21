package com.wutl.demo.event;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description:
 * @date 2021-2-21 13:50
 */
@Component
public class CustomEvent extends ApplicationEvent {

    public CustomEvent(@Qualifier("jacksonObjectMapper") Object source) {
        super(source);
    }
}
