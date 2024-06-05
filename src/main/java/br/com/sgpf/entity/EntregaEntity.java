package br.com.sgpf.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


	@Entity
	@Table(name = "entrega" , schema = "sgpf")
	public class EntregaEntity implements Serializable {

		private static final long serialVersionUID = 1L;	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "identrega")
		private Long idEntrega;
		
		@Column(name = "nome")
		private String nome;

		public Long getIdEntrega() {
			return idEntrega;
		}

		public void setIdEntrega(Long idEntrega) {
			this.idEntrega = idEntrega;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

	
		
		

	}	

