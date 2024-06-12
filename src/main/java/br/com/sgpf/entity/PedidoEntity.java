package br.com.sgpf.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

/**@ManyToOne()
@JoinColumn(name = "cliente_idCliente", referencedColumnName = "idcliente")
private String cliente_idCliente;

@ManyToOne()
@JoinColumn(name = "restaurante_idRestaurante", referencedColumnName = "idRestaurante")
private String restaurante_idRestaurante;

@ManyToOne()
@JoinColumn(name = "produto_idProduto", referencedColumnName = "idproduto")
private String produto_idProduto;

@ManyToOne()
@JoinColumn(name = "itemPedido_idItemPedido", referencedColumnName = "idItemPedido")
private String itemPedido_idItemPedido;
*/
public long getIdPedido() {
	return idPedido;
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
}


/**
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




public void setIdPedido(long idPedido) {
	this.idPedido = idPedido;
}
*/


/**
@Override
public int hashCode() {
	return Objects.hash(cliente_idCliente, datapedido, idPedido, itemPedido_idItemPedido, produto_idProduto,
			restaurante_idRestaurante, statuspedido, totalpedido);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	PedidoEntity other = (PedidoEntity) obj;
	return Objects.equals(cliente_idCliente, other.cliente_idCliente) && Objects.equals(datapedido, other.datapedido)
			&& idPedido == other.idPedido && Objects.equals(itemPedido_idItemPedido, other.itemPedido_idItemPedido)
			&& Objects.equals(produto_idProduto, other.produto_idProduto)
			&& Objects.equals(restaurante_idRestaurante, other.restaurante_idRestaurante)
			&& Objects.equals(statuspedido, other.statuspedido) && Objects.equals(totalpedido, other.totalpedido);
}

} */
