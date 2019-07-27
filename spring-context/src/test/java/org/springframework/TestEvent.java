package org.springframework;

import org.springframework.context.ApplicationEvent;

/**
 * @Author hechenglong
 * @Date 2019/7/27
 * @Description
 **/

public class TestEvent extends ApplicationEvent {

	/**
	 * Create a new {@code ApplicationEvent}.
	 *
	 * @param source the object on which the event initially occurred or with which the event is
	 * associated (never {@code null})
	 */
	public TestEvent(Object source) {
		super(source);
	}


}
