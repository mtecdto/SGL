package com.api.sgl.entity;

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

@Entity
@Table(name="nota")
public class Nota {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="numero")
	private int numero;
	
	@OneToMany(mappedBy="nota",fetch=FetchType.LAZY)
	private List<ChaveWindowsEntity> chavesWindows;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	
	public void setChavesWindows(List<ChaveWindowsEntity> chavesWindows) {
		this.chavesWindows = chavesWindows;
	}

	public List<ChaveWindowsEntity> getChavesWindows() {
		return chavesWindows;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nota other = (Nota) obj;
		return id == other.id && numero == other.numero;
	}
	
}
