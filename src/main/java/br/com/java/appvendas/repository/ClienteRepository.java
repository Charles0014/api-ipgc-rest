package br.com.java.appvendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.java.appvendas.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	Cliente findById(long id);
}
