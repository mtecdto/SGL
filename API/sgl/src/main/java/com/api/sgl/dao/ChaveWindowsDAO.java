package com.api.sgl.dao;

import java.util.Objects;

public class ChaveWindowsDAO {

	private String conteudo;
	private String serial;
	private int hdssd;
	private int memoria;
	private int status;
	private Long nota;
	private Long pedidoVenda;
	
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
	public Long getNota() {
		return nota;
	}
	public void setNota(Long nota) {
		this.nota = nota;
	}
	public Long getPedidoVenda() {
		return pedidoVenda;
	}
	public void setPedidoVenda(Long pedidoVenda) {
		this.pedidoVenda = pedidoVenda;
	}
	@Override
	public int hashCode() {
		return Objects.hash(conteudo, hdssd, memoria, nota, pedidoVenda, serial, status);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChaveWindowsDAO other = (ChaveWindowsDAO) obj;
		return Objects.equals(conteudo, other.conteudo) && hdssd == other.hdssd && memoria == other.memoria
				&& Objects.equals(nota, other.nota) && Objects.equals(pedidoVenda, other.pedidoVenda)
				&& Objects.equals(serial, other.serial) && status == other.status;
	}
	
}
