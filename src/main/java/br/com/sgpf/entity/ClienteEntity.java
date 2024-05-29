package br.com.sgpf.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente", schema = "GerenciamentoDePedidosFood")
public class ClienteEntity implements Serializable {
	
private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private long idCliente;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "cep")
	private String cep;
	
	@Column(name = "rua")
	private String rua;
	
	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "bairro")
	private String bairro;
	
	@Column(name = "numero")
	private String numero;
	
	
	
	
	
	

	

}
