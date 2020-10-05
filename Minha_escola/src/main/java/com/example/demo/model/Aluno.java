package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Minha_escola")
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id_anluno;
	@Column
	private String nome;
	@Column
	private boolean matriculado;
	
	//get and set
	public Long getId_anluno() {
		return id_anluno;
	}
	public void setId_anluno(Long id_anluno) {
		this.id_anluno = id_anluno;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isMatriculado() {
		return matriculado;
	}
	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}
	
	
}
