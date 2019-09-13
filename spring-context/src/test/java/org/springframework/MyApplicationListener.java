package org.springframework;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * @Author: hechenglo03
 * @Date:2019/8/29
 * @Description:
 */
public class MyApplicationListener implements ApplicationListener<ContextStoppedEvent> {

	@Override
	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println("生成ContextStoppedEvent");
	}
}
