package br.com.sgpf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ClienteRepository {

	ClienteEntity getOneByIdCliente(Long idCliente);
}
