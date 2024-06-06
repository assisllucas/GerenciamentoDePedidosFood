package br.com.sgpf.entity;


import java.io.Serializable;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "permissao" , schema = "sgpf")
public class PermissaoEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_permissao")
	private Long id_permissao;

	@Column(name = "nome")
	private String nome;

	public Long getId_permissao() {
		return id_permissao;
	}

	public void setId_permissao(Long id_permissao) {
		this.id_permissao = id_permissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}