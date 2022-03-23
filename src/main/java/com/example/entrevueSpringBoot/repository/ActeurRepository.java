package com.example.entrevueSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entrevueSpringBoot.entites.Acteur;

public interface ActeurRepository extends JpaRepository<Acteur, Long> {

}
