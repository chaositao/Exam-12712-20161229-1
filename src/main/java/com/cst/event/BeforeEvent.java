package com.cst.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.stereotype.Component;

@Component
public class BeforeEvent extends ApplicationContextEvent {

	public BeforeEvent(ApplicationContext source) {
		super(source);
	}

}
