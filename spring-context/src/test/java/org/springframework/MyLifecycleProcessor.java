package org.springframework;

import org.springframework.context.LifecycleProcessor;

/**
 * @Author: hechenglo03
 * @Date:2019/9/1
 * @Description:
 */
public class MyLifecycleProcessor implements LifecycleProcessor {
	@Override
	public void onRefresh() {

	}

	@Override
	public void onClose() {
		System.out.println("监测关闭");
	}

	@Override
	public void start() {
		System.out.println("正在启动");
	}

	@Override
	public void stop() {
		System.out.println("正在关闭");
	}

	@Override
	public boolean isRunning() {
		return false;
	}
}
