package br.com.sgpf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sgpf.entity.EntregaEntity;

@Repository
public interface EntregaRepository extends JpaRepository<EntregaEntity, Long> {

}
