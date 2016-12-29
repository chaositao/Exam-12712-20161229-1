package com.cst.apptest;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cst.dto.Film;
import com.cst.service.FilmService;

public class AppTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");
		FilmService filmService = applicationContext.getBean(FilmService.class);
		Scanner sc = new Scanner(System.in);
		Film film = new Film();
		System.out.println("请输入电影名称(title)");
		String title = sc.next();
		System.out.println("请输入电影描述(description)");
		String description = sc.next();
		System.out.println("请输入语言ID(language_id)");
		Integer languageId = sc.nextInt();
		film.setTitle(title);
		film.setDescription(description);
		film.setLanguageId(languageId);
		filmService.insertFilm(film);
		applicationContext.close();
	}
}
