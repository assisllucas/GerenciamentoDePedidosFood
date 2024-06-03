package br.com.sgpf.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class EntregaEntity {

	@Entity
	@Table(name = "entrega" , schema = "sgpf")
	public class SetorEntity implements Serializable {

		private static final long serialVersionUID = 1L;	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "identrega")
		private Long idEntrega;
		
		@Column(name = "retirada")
		private String retirada;

		@Column(name = "delivery")
		private String delivery;

		public Long getIdEntrega() {
			return idEntrega;
		}

		public void setIdEntrega(Long idEntrega) {
			this.idEntrega = idEntrega;
		}

		public String getRetirada() {
			return retirada;
		}

		public void setRetirada(String retirada) {
			this.retirada = retirada;
		}

		public String getDelivery() {
			return delivery;
		}

		public void setDelivery(String delivery) {
			this.delivery = delivery;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Objects.hash(delivery, idEntrega, retirada);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			SetorEntity other = (SetorEntity) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			return Objects.equals(delivery, other.delivery) && Objects.equals(idEntrega, other.idEntrega)
					&& Objects.equals(retirada, other.retirada);
		}

		private EntregaEntity getEnclosingInstance() {
			return EntregaEntity.this;
		}
		
		
		

	}
}
