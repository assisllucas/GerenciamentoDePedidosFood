
package br.com.sgpf.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ProdutoEntity {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idproduto")
	private long idProduto;

	@Column(name = "nome")
	private String nome;
	
	@Column(name = "quantidade")
	private String quantidade;
}
