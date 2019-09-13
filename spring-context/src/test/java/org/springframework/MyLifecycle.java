package org.springframework;

import org.springframework.context.Lifecycle;

/**
 * @Author: hechenglo03
 * @Date:2019/9/1
 * @Description:
 */
public class MyLifecycle implements Lifecycle {
	@Override
	public void start() {
		System.out.println("MyLifecycle is starting");
	}

	@Override
	public void stop() {
		System.out.println("MyLifeCycle is stopping");
	}

	@Override
	public boolean isRunning() {
		return false;
	}
}
