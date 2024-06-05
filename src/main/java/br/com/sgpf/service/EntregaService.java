package br.com.sgpf.service;

import java.util.List;

import br.com.sgpf.entity.EntregaEntity;

public interface EntregaService {
	
	List<EntregaEntity> findAll();

	String save(EntregaEntity entregaEntity) throws Exception;

	EntregaEntity getOneByIdEntrega(Long idEntrega) throws Exception;

}
