package com.example.entrevueSpringBoot.entites;

import java.io.Serializable;

import java.util.List;

 

import javax.persistence.CascadeType;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.EntityListeners;

import javax.persistence.FetchType;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;

import javax.persistence.Table;

 

import org.hibernate.annotations.DynamicUpdate;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

 

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

 

import lombok.AllArgsConstructor;

import lombok.Getter;

import lombok.NoArgsConstructor;

import lombok.Setter;

 

@Entity

@Table(name = "Film")

@EntityListeners(AuditingEntityListener.class)

@DynamicUpdate

@Getter

@Setter

@NoArgsConstructor

@AllArgsConstructor

@JsonIgnoreProperties({ "hibernateLazyInitializer" })

public class Film implements Serializable {

 

       /**

       *

        */

       private static final long serialVersionUID = 1543463980804906280L;

 

       @Id

       @GeneratedValue(strategy = GenerationType.AUTO)

       @Column(name = "id", updatable = false)

       private Long id;

 

       @Column(name = "titre")

       private String titre;

 

       @Column(name = "description")

       private String description;

 

       @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)

       @JoinColumn(name = "id", nullable = false, updatable = false)

       private List<Acteur> acteurs;

}
