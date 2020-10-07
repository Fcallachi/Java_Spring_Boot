package com.example.demo.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal; 
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull; 


@Entity
@Table(name = "categoria")  
public class Categoria {
		
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
		
	@NotNull
	@Size(min = 5, max = 100)
	private String nome;
		
	@NotNull
	@Size(min = 10, max = 500)
	private String tipo;	

	@NotNull
	@Size(min = 10, max = 500)
	private String console;	
	
	/*@ManyToOne 
	@JsonIgnoreProperties("categoria")
	private Categoria categoria;*/
		
}
