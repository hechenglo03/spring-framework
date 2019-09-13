package org.springframework;

import org.springframework.context.ApplicationEvent;

/**
 * @Author: hechenglo03
 * @Date:2019/8/29
 * @Description:
 */
public class MyApplicationEvent extends ApplicationEvent {
	/**
	 * Create a new {@code ApplicationEvent}.
	 *
	 * @param source the object on which the event initially occurred or with
	 *               which the event is associated (never {@code null})
	 */
	public MyApplicationEvent(Object source) {
		super(source);
	}
}
