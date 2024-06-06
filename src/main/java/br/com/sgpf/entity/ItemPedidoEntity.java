package br.com.sgpf.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "itempedido", schema = "sgpf")
public class ItemPedidoEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idItemPedido")
	private long idItemPedido;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "quantidade")
	private String quantidade;

	public long getIdItemPedido() {
		return idItemPedido;
	}

	public void setIdItemPedido(long idItemPedido) {
		this.idItemPedido = idItemPedido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
