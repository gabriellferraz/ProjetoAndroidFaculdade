package com.example.myhelp.BD;

public class Cliente {
	private long idCliente;
	private String nome;
	private String cpf;
	private String dataNascimento;
	private String telefone1;
	private String telefone2;
	private long idUsuario;
	
	public long getidCliente() {
		return idCliente;
	}
	public void setidCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	
	
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	
	public String getcpf() {
		return cpf;
	}
	public void setcpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public String getdataNascimento() {
		return dataNascimento;
	}
	public void setdataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
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
