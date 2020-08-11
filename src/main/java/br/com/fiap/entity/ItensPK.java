package br.com.fiap.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ItensPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "pedidoPk")
	private Integer pedidoPk;

	@Column(name = "produtoPk")
	private Integer produtoPk;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ItensPK) {
			ItensPK itensPK = (ItensPK) obj;
			if (this.pedidoPk == itensPK.getPedidoPk() && this.produtoPk == itensPK.getProdutoPk()) {
				return true;
			}
		} else {
			return false;
		}
		return false;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(pedidoPk, produtoPk);
	}

	public Integer getPedidoPk() {
		return pedidoPk;
	}

	public void setPedidoPk(Integer pedidoPk) {
		this.pedidoPk = pedidoPk;
	}

	public Integer getProdutoPk() {
		return produtoPk;
	}

	public void setProdutoPk(Integer produtoPk) {
		this.produtoPk = produtoPk;
	}

}