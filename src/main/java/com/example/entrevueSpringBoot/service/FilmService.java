package com.example.entrevueSpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.entrevueSpringBoot.entites.Film;

import com.example.entrevueSpringBoot.repository.FilmRepository;

@Service
public class FilmService {

	@Autowired
	private FilmRepository filmRepository;

	public Film obtenirFilm(Long id)
	{
		return filmRepository.getById(id);
	}

	public Film ajouterFilm(Film film) throws Exception {

		Film nouveauFilm = null;

		try {

			nouveauFilm = filmRepository.saveAndFlush(film);

		} catch (Exception e) {

			throw new Exception("oops");

		}

		return nouveauFilm;

	}

}
