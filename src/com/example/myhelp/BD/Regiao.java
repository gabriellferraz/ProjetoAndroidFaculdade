package com.example.myhelp.BD;

public class Regiao {
	private long idRegiao;
	private String nome;
	private long idPrestadorServico;
	private long idPrestador;
	private long idUsuario;
	
	public long getidRegiao() {
		return idRegiao;
	}
	public void setidRegiao(long idRegiao) {
		this.idRegiao = idRegiao;
	}
	
	
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
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
