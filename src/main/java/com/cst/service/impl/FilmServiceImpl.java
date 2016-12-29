package com.cst.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cst.dto.Film;
import com.cst.mapper.FilmMapper;
import com.cst.service.FilmService;

@Service
@Transactional
public class FilmServiceImpl implements FilmService {

	@Autowired
	private FilmMapper filmMapper;

	public void insertFilm(Film film) {
		filmMapper.insertFilm(film);
	}

}
