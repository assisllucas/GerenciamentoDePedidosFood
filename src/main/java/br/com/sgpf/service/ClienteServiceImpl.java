package br.com.sgpf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sgpf.entity.ClienteEntity;
import br.com.sgpf.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	private String mensagem;
	
	@Override
	public String save(ClienteEntity clienteEntity) throws Exception {
		
		if (clienteEntity.getNome() == null) {
			this.mensagem = "Digite o nome.";
			throw new Exception("Preencha o nome do cliente.");	
		}
		
		else if (clienteEntity.getCep() == null) {
			this.mensagem = "Preencha o cep.";
			throw new Exception("Preencha o nome do cliente");
			
		}
			else if (clienteEntity.getRua() == null) {
				this.mensagem = "Preencha o rua.";
				throw new Exception("Preencha o nome do cliente");
			}
			
			else if (clienteEntity.getTelefone() == null) {
				this.mensagem = "Preencha o telefone do cliente.";
				throw new Exception("Preencha o nome do cliente");
			}
			
			else if (clienteEntity.getBairro() == null) {
				this.mensagem = "Preencha o Bairro.";
				throw new Exception("Preencha o nome do cliente");
			}
			
			else if (clienteEntity.getNumero() == null) {
				this.mensagem = "Preencha o numero da residência.";
				throw new Exception("Preencha o nome do cliente");
			}
			
			else
			{
				clienteRepository.saveAndFlush(clienteEntity);
			}
			
		return mensagem;
		
	}	
@Override
public List<ClienteEntity> findAll() {
	
	return clienteRepository.findAll();
}
@Override
public ClienteEntity getOneByIdCliente(Long idCliente)throws Exception {
	
	return clienteRepository.getOneByIdCliente(idCliente);
}
@Override
public String deleteById(Long idCliente) throws Exception {
	try {
		
	clienteRepository.deleteById(idCliente);
	this.mensagem = "Cliente excluido com sucesso.";
	
	} catch (Exception e) {
	throw new Exception(e.getMessage());	
	}
	return mensagem;
}
// termina a exclusão
@Override
public String update(ClienteEntity clienteEntity) throws Exception {
	// TODO Auto-generated method stub
	return null;
}

/** @Override
public String update(ClienteEntity clienteEntity) throws Exception {
	if (clienteEntity.getNome() == null) {
		this.mensagem = "Digite o nome.";
		throw new Exception("Preencha o nome do cliente.");	
	}
	
	else if (clienteEntity.getCep() == null) {
		this.mensagem = "Preencha o cep.";
		throw new Exception("Preencha o nome do cliente");
		
	}
		else if (clienteEntity.getRua() == null) {
			this.mensagem = "Preencha o rua.";
			throw new Exception("Preencha o nome do cliente");
		}
		
		else if (clienteEntity.getTelefone() == null) {
			this.mensagem = "Preencha o telefone do cliente.";
			throw new Exception("Preencha o nome do cliente");
		}
		
		else if (clienteEntity.getBairro() == null) {
			this.mensagem = "Preencha o Bairro.";
			throw new Exception("Preencha o nome do cliente");
		}
		
		else if (clienteEntity.getNumero() == null) {
			this.mensagem = "Preencha o numero da residência.";
			throw new Exception("Preencha o nome do cliente");
		}
		
		else
		{
			clienteRepository.alterarCliente(clienteEntity.getNome(), 
					 clienteEntity.getCep(), 
					 clienteEntity.getRua(),
					 clienteEntity.getTelefone(),
					 clienteEntity.getBairro(),
					 clienteEntity.getNumero(),
					 clienteEntity.getIdCliente());
			
this.mensagem = "cliente alterado com sucesso.";	
		}
	return mensagem;
}*/




	
	}
