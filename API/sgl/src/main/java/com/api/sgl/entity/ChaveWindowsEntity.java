package com.api.sgl.entity;

import java.util.Objects;
import java.util.Optional;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="chavewindows")
public class ChaveWindowsEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="conteudo")
	@Size(min=29,max=29)
	@NotBlank
	private String conteudo;
	
	@Column(name="serial")
	private String serial;
	
	@Column(name="hdssd")
	private int hdssd;
	
	@Column(name="memoria")
	private int memoria;
	
	@Column(name="status")
	private int status;
	
	@OneToOne
	@JoinColumn(name="nota_id")
	private Optional<Nota> nota;
	
	@OneToOne
	@JoinColumn(name="pedido_venda_id")
	private Optional<PedidoVendaEntity> pedidoVenda;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public int getHdssd() {
		return hdssd;
	}

	public void setHdssd(int hdssd) {
		this.hdssd = hdssd;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Optional<Nota> getNota() {
		return nota;
	}

	public void setNota(Optional<Nota> nota2) {
		this.nota = nota2;
	}

	public Optional<PedidoVendaEntity> getPedidoVenda() {
		return pedidoVenda;
	}

	public void setPedidoVenda(Optional<PedidoVendaEntity> optional) {
		this.pedidoVenda = optional;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudo, hdssd, id, memoria, nota, pedidoVenda, serial, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChaveWindowsEntity other = (ChaveWindowsEntity) obj;
		return Objects.equals(conteudo, other.conteudo) && hdssd == other.hdssd && id == other.id
				&& memoria == other.memoria && Objects.equals(nota, other.nota)
				&& Objects.equals(pedidoVenda, other.pedidoVenda) && Objects.equals(serial, other.serial)
				&& status == other.status;
	}
	
}
