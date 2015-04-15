package com.example.myhelp.BD;

public class PessoaJuridica {
	private long idPessoaJuridica;
	private String razaoSocial;
	private String dataFundacao;
	private String cnpj;
	private long idPrestador;
	private long idUsuario;
	
	public long getidPessoaJuridica() {
		return idPessoaJuridica;
	}
	public void setidPessoaJuridica(long idPessoaJuridica) {
		this.idPessoaJuridica = idPessoaJuridica;
	}
	
	
	public String getrazaoSocial() {
		return razaoSocial;
	}
	public void setrazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	
	public String getdataFundacao() {
		return dataFundacao;
	}
	public void setdataFundacao(String dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	
	
	public String getcnpj() {
		return cnpj;
	}
	public void setcnpj(String cnpj) {
		this.cnpj = cnpj;
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
