package com.example.myhelp.BD;

public class Servico {
	private long idServico;
	private String categoria;
	private String descricao;
	private String status;
	private long idPrestadorServico;
	private long idPrestador;
	private long idUsuario;
	
	public long getidServico() {
		return idServico;
	}
	public void setidServico(long idServico) {
		this.idServico = idServico;
	}
	
	
	public String getcategoria() {
		return categoria;
	}
	public void setcategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	public String getdescricao() {
		return descricao;
	}
	public void setdescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	public String getstatus() {
		return status;
	}
	public void setstatus(String status) {
		this.status = status;
	}
	
	
	public long getidPrestadorServico() {
		return idPrestadorServico;
	}
	public void setidPrestadorServico(long idPrestadorServico) {
		this.idPrestadorServico = idPrestadorServico;
	}
	
	
	public long getidPrestador() {
		return idPrestador;
	}
	public void setidPrestador(long idPrestador) {
		this.idPrestador = idPrestador;
	}
	
	
	public long getidUsuario() {
		return idUsuario;
	}
	public void setidUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
		
}
