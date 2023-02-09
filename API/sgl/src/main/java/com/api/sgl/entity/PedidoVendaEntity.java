package com.api.sgl.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="pedidovenda")
public class PedidoVendaEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="numero", unique=true)
	@NotNull
	private Integer numero;
	
	@Column(name="dhinicio")
	private LocalDateTime dhInicio = LocalDateTime.now();
	
	@Column(name="dhtermino")
	private LocalDateTime dhTermino;
	
	@OneToMany(mappedBy="pedidoVenda",fetch=FetchType.LAZY)
	private List<ChaveWindowsEntity> chavesWindows;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public LocalDateTime getDhInicio() {
		return dhInicio;
	}

	public void setDhInicio(LocalDateTime dhInicio) {
		this.dhInicio = dhInicio;
	}

	public LocalDateTime getDhTermino() {
		return dhTermino;
	}

	public void setDhTermino(LocalDateTime dhTermino) {
		this.dhTermino = dhTermino;
	}

	public List<ChaveWindowsEntity> getChavesWindows() {
		return chavesWindows;
	}

	@Override
	public int hashCode() {
		return Objects.hash(chavesWindows, dhInicio, dhTermino, id, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PedidoVendaEntity other = (PedidoVendaEntity) obj;
		return Objects.equals(chavesWindows, other.chavesWindows) && Objects.equals(dhInicio, other.dhInicio)
				&& Objects.equals(dhTermino, other.dhTermino) && id == other.id && Objects.equals(numero, other.numero);
	}
	
}
