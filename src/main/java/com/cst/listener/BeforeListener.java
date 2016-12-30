package com.cst.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.cst.event.BeforeEvent;

@Component
public class BeforeListener implements ApplicationListener<BeforeEvent> {

	public void onApplicationEvent(BeforeEvent event) {
		System.out.println("Before Insert Film Data");
	}

}
