package br.com.sgpf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sgpf.entity.PedidoEntity;


public interface PedidoRepository extends JpaRepository<PedidoEntity, Long>{

	PedidoEntity getOneByIdPedido(Long idPedido);
}
