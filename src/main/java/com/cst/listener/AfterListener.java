package com.cst.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.cst.event.AfterEvent;

@Component
public class AfterListener implements ApplicationListener<AfterEvent> {

	public void onApplicationEvent(AfterEvent event) {
		System.out.println("After Insert Film Data");
	}
}
