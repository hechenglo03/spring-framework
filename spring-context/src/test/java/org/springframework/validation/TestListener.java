package org.springframework.validation;

import org.springframework.TestEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Author hechenglong
 * @Date 2019/7/27
 * @Description
 **/

public class TestListener implements ApplicationListener<TestEvent> {

	@Override
	public void onApplicationEvent(TestEvent event) {
		System.out.println("监听器在启动当中");
	}
}
