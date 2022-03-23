package com.example.entrevueSpringBoot.entites;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Acteur")
@EntityListeners(AuditingEntityListener.class)
@DynamicUpdate
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Acteur implements Serializable {

	private static final long serialVersionUID = 6978419050498143984L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "acteurId")
	private Long acteurId;

	@Column(name = "nom")
	private String nom;

	@Column(name = "prenom")
	private String prenom;

}
