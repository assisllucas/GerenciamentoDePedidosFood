package br.com.sgpf.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	private String mensagem;
	
	@Override
	public String save(ClienteEntity clienteEntity) throws Exception {
		
		if (clienteEntity.getNome() == null) {
			this.mensagem = "Digite o nome do cliente.";
			throw new Exception("Preencha o nome do cliente.");	
		}
		
		else if (clienteEntity.getCep() = null) {
			this.mensagem = "Preencha o cep do cliente.";
			throw new Exception("Preencha o nome do cliente");
		}
		
		else if (clienteEntity.getRua() = null) {
			this.mensagem = "Preencha o rua do cliente.";
			throw new Exception("Preencha o nome do cliente");
		}
		
		else if (clienteEntity.getTelefone() = null) {
			this.mensagem = "Preencha o telefone do cliente.";
			throw new Exception("Preencha o nome do cliente");
		}
		
		else if (clienteEntity.getBairro() = null) {
			this.mensagem = "Preencha o Bairro do cliente.";
			throw new Exception("Preencha o nome do cliente");
		}
		
		else if (clienteEntity.getNumero() = null) {
			this.mensagem = "Preencha o numero da residência do cliente.";
			throw new Exception("Preencha o nome do cliente");
		}
		
		else
		{
			clienteRepository.saveAndFlush(clienteEntity);
		}
		
		clienteRepository.incluirCliente(clienteEntity.getNome(), 
				clienteEntity.getCep(), 
				clienteEntity.getRua(), 
				clienteEntity.getTelefone(), 
				clienteEntity.getBairro(),
				clienteEntity.getNumero());
this.mensagem = "CLiente cadastrado com sucesso.";	
}

return mensagem;
}

@Override
public List<ClienteEntity> findAll() {

return clienteRepository.findAll();
}

@Override
public clienteEntity getOneByIdCliente(Long idCliente) throws Exception {


return clienteRepository.getOneByIdDocente(idCliente);
}

//Começa Exclusão
@Override
public String deleteById(Long idCliente) throws Exception {
try 
{
clienteRepository.excluirCliente(idCliente);
this.mensagem = "Cliente excluído com sucesso.";	

} catch (Exception e) {
throw new Exception(e.getMessage());
}
return mensagem;
}
//Termina Exclusão

@Override
public String update(ClienteEntity clienteEntity) throws Exception {
if (clienteEntity.getNome() == null) {
this.mensagem = "Digite o nome do cliente.";		
throw new Exception("Prencha o nome do cliente.");				
}
else if (clienteEntity.getCep() == null) {
this.mensagem = "Preencha o cep do cliente.";		
throw new Exception("Prencha o nome do cliente.");				
}
else if (clienteEntity.getRua() == null) {
this.mensagem = "Preencha o rua";		
throw new Exception("Prencha o nome do cliente.");				
}
else if (clienteEntity.getTelefone() == null) {
this.mensagem = "Preencha o telefone";		
throw new Exception("Prencha o nome do cliente.");				
}
else if (clienteEntity.getBairro() == null) {
this.mensagem = "Preencha o bairro";		
throw new Exception("Prencha o nome do cliente.");				
}
else if (clienteEntity.getNumero() == null) {
this.mensagem = "Preencha o numero da residência do cliente";		
throw new Exception("Prencha o nome do cliente.");				
}
else
{
	clienteRepository.incluirCliente(clienteEntity.getNome(), 
			clienteEntity.getCep(), 
			clienteEntity.getRua(), 
			clienteEntity.getTelefone(), 
			clienteEntity.getBairro(),
			clienteEntity.getNumero(),
			clienteEntity.getIdCliente());
this.mensagem = "Cliente alterado com sucesso.";	
}

return mensagem;
}

@Override
public ClienteEntity getOneBy(String Cpf) throws Exception {

return clienteRepository.getOneByCpf(Cpf);
}

@Override
public String saveOrUpdate(ClienteEntity clienteEntity) throws Exception {
clienteRepository.save(clienteEntity);
this.mensagem = "Disponibilidade cadastrada com sucesso";	
return mensagem;
}

		
}
