package br.com.sgpf.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "pedido", schema = "sgpf")
public class PedidoEntity implements Serializable {
	
private static final long serialVersionUID = 1L;


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "idpedido")
private long idPedido;

@Column(name = "totalpedido")
private String totalpedido;

@Column(name = "statuspedido")
private String statuspedido;

@Column(name = "datapedido")
private String datapedido;

@Column(name = "cliente_idCliente")
private String cliente_idCliente;

@Column(name = "restaurante_idRestaurante")
private String restaurante_idRestaurante;

@Column(name = "produto_idProduto")
private String produto_idProduto;

@Column(name = "itemPedido_idItemPedido")
private String itemPedido_idItemPedido;

public long getIdPedido() {
	return idPedido;
}

public void setIdPedido(long idPedido) {
	this.idPedido = idPedido;
}

public String getTotalpedido() {
	return totalpedido;
}

public void setTotalpedido(String totalpedido) {
	this.totalpedido = totalpedido;
}

public String getStatuspedido() {
	return statuspedido;
}

public void setStatuspedido(String statuspedido) {
	this.statuspedido = statuspedido;
}

public String getDatapedido() {
	return datapedido;
}

public void setDatapedido(String datapedido) {
	this.datapedido = datapedido;
}

public String getCliente_idCliente() {
	return cliente_idCliente;
}

public void setCliente_idCliente(String cliente_idCliente) {
	this.cliente_idCliente = cliente_idCliente;
}

public String getRestaurante_idRestaurante() {
	return restaurante_idRestaurante;
}

public void setRestaurante_idRestaurante(String restaurante_idRestaurante) {
	this.restaurante_idRestaurante = restaurante_idRestaurante;
}

public String getProduto_idProduto() {
	return produto_idProduto;
}

public void setProduto_idProduto(String produto_idProduto) {
	this.produto_idProduto = produto_idProduto;
}

public String getItemPedido_idItemPedido() {
	return itemPedido_idItemPedido;
}

public void setItemPedido_idItemPedido(String itemPedido_idItemPedido) {
	this.itemPedido_idItemPedido = itemPedido_idItemPedido;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

}
