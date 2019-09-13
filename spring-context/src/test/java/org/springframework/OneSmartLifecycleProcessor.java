package org.springframework;

import org.springframework.context.SmartLifecycle;

/**
 * @Author: hechenglo03
 * @Date:2019/9/1
 * @Description:
 */
public class OneSmartLifecycleProcessor implements SmartLifecycle {
	@Override
	public void start() {
		System.out.println("ONE START");
	}

	@Override
	public void stop() {
		System.out.println("ONE  END");
	}

	@Override
	public boolean isRunning() {
		return true;
	}

	@Override
	public int getPhase() {
		return 1;
	}
}
