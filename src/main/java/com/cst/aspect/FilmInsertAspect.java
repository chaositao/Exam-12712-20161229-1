package com.cst.aspect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.cst.event.AfterEvent;
import com.cst.event.BeforeEvent;

public class FilmInsertAspect {

	@Autowired
	private ApplicationContext applicationContext;

	public void before() {
		applicationContext.publishEvent(new BeforeEvent(applicationContext));
	}

	public void after() {
		applicationContext.publishEvent(new AfterEvent(applicationContext));
	}
}
