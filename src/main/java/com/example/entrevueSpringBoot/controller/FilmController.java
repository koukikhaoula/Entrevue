package com.example.entrevueSpringBoot.controller;

import static com.example.entrevueSpringBoot.utils.Constantes.BASE_PATH;
import static com.example.entrevueSpringBoot.utils.Constantes.DOC_GET;
import static com.example.entrevueSpringBoot.utils.Constantes.DOC_POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entrevueSpringBoot.entites.Film;
import com.example.entrevueSpringBoot.service.FilmService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping(path = BASE_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
public class FilmController {

	@Autowired

	private FilmService filmService;

	@ApiOperation(value = DOC_GET)
	@ApiResponse(code = 200, message = "Retourne un film.", response = Film.class)
	@GetMapping("/{id}")
	public ResponseEntity<Film> obtenirFilm(@ApiParam(required = true) @PathVariable(required = false) Long id) {

		Film film = filmService.obtenirFilm(id);

		return new ResponseEntity<Film>(film, HttpStatus.OK);

	}

	@ApiOperation(value = DOC_POST)
	@ApiResponse(code = 201, message = "Retourne un film crée.", response = Film.class)
	@PostMapping()
	public ResponseEntity<Film> ajouterFilm(@ApiParam(required = true) @RequestBody Film film) throws Exception {

		Film nouveaufilm = filmService.ajouterFilm(film);

		return new ResponseEntity<Film>(nouveaufilm, HttpStatus.CREATED);

	}

}
