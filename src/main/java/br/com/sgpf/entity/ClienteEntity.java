package br.com.sgpf.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente", schema = "sgpf")
public class ClienteEntity implements Serializable {
	
private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcliente")
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
	
	@OneToOne()
	@JoinColumn(name = "entregaid", referencedColumnName = "identrega")
	private EntregaEntity entrega;


	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bairro, cep, idCliente, nome, numero, rua, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteEntity other = (ClienteEntity) obj;
		return Objects.equals(bairro, other.bairro) && Objects.equals(cep, other.cep) && idCliente == other.idCliente
				&& Objects.equals(nome, other.nome) && Objects.equals(numero, other.numero)
				&& Objects.equals(rua, other.rua) && Objects.equals(telefone, other.telefone);
	}
	

	
	
}