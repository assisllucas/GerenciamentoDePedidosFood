package br.com.sgpf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.sgpf.entity.PedidoEntity;
import br.com.sgpf.repository.PedidoRepository;

public class PedidoServiceImpl implements PedidoService {
	
	/**@Autowired
	private PedidoRepository pedidoRepository;
	
	private String mensagem;
	
	@Override
	public String save(PedidoEntity pedidoEntity) throws Exception {
		
		if (pedidoEntity.getTotalpedido() == null) {
			this.mensagem = "Digite o valor total do pedido";
			throw new Exception("Preencha o valor do pedido.");	
		}
		
		else if (pedidoEntity.getStatuspedido() == null) {
			this.mensagem = "Preencha o status do pedido.";
			throw new Exception("Preencha o status do pedido");
			
		}
			else if (pedidoEntity.getDatapedido() == null) {
				this.mensagem = "Preencha a data do pedido.";
				throw new Exception("Preencha a data do pedido");
			}
			
			else
			{
				pedidoRepository.saveAndFlush(pedidoEntity);
			}
			
		return mensagem;
		
	}	
@Override
public List<PedidoEntity> findAll() {
	
	return pedidoRepository.findAll();
}
@Override
public PedidoEntity getOneByIdPedido(Long idPedido)throws Exception {
	
	return pedidoRepository.getOneByIdPedido(idPedido);
}
@Override
public String deleteById(Long idPedido) throws Exception {
	try {
		
	pedidoRepository.deleteById(idPedido);
	this.mensagem = "Pedido excluido com sucesso.";
	
	} catch (Exception e) {
	throw new Exception(e.getMessage());	
	}
	return mensagem;
}
// termina a exclusão
@Override
public String update(PedidoEntity pedidoEntity) throws Exception {
	// TODO Auto-generated method stub
	return null;
}
	*/
}
