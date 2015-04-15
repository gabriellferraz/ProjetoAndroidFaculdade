package com.example.myhelp.BD;

public class PessoaFisica {
	private long idPessoaFisica;
	private String dataNascimento;
	private String cpf;
	private long idPrestador;
	private long idUsuario;
	
	public long getidPessoaFisica() {
		return idPessoaFisica;
	}
	public void setidPessoaFisica(long idPessoaFisica) {
		this.idPessoaFisica = idPessoaFisica;
	}
	
	
	public String getdataNascimento() {
		return dataNascimento;
	}
	public void setdataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	public String getcpf() {
		return cpf;
	}
	public void setcpf(String cpf) {
		this.cpf = cpf;
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
