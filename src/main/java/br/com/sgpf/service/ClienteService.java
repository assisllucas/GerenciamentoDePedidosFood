package br.com.sgpf.service;

import java.util.List;


import br.com.sgpf.entity.ClienteEntity;

public interface ClienteService {
	
	
	String save(ClienteEntity clienteEntity) throws Exception;
	List<ClienteEntity> findAll();
	ClienteEntity getOneByIdCliente(Long idCliente) throws Exception;
	//Começa exclusão
	String deleteById(Long idCliente) throws Exception;
	//Termina exclusão
	String update(ClienteEntity clienteEntity) throws Exception;
	

}
