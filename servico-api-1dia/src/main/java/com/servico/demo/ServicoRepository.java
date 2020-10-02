package com.servico.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<ServicoModel, Long>{

	List<ServicoModel> findByNome(String nome);

	
}
