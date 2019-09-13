package org.springframework;

import org.springframework.context.SmartLifecycle;

/**
 * @Author: hechenglo03
 * @Date:2019/9/1
 * @Description:
 */
public class TwoSmartLifecycleProcessor implements SmartLifecycle {
	@Override
	public void start() {
		System.out.println("TWO START");
	}

	@Override
	public void stop() {
		System.out.println("TWO END");
	}

	@Override
	public boolean isRunning() {
		return false;
	}

	@Override
	public int getPhase() {
		return 2;
	}
}
