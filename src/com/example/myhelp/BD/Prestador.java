package com.example.myhelp.BD;

public class Prestador {
	private long idPrestador;
	private String nome;
	private String telefone1;
	private String telefone2;
	private long idUsuario;
	
	public long getidPrestador() {
		return idPrestador;
	}
	public void setidPrestador(long idPrestador) {
		this.idPrestador = idPrestador;
	}
	
	
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	
	public String gettelefone1() {
		return telefone1;
	}
	public void settelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}
	
	
	public String gettelefone2() {
		return telefone2;
	}
	public void settelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}
	
	
	public long getidUsuario() {
		return idUsuario;
	}
	public void setidUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
}
