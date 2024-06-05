package br.com.sgpf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sgpf.entity.EntregaEntity;
import br.com.sgpf.repository.EntregaRepository;

@Service
public class EntregaServiceImpl implements EntregaService {
	
	@Autowired
	private EntregaRepository entregaRepository;
	
	private String mensagem;
	
	@Override
	public String save(EntregaEntity entregaEntity) throws Exception {
		
		if (entregaEntity.getNome() == null) {
			this.mensagem = "Digite o nome.";
			throw new Exception("Preencha o nome do cliente.");	
		}
		
		else
		{
				entregaRepository.saveAndFlush(entregaEntity);
			}
			
		return mensagem;
		
	}

	@Override
	public List<EntregaEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntregaEntity getOneByIdEntrega(Long idEntrega) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}	

	
	}