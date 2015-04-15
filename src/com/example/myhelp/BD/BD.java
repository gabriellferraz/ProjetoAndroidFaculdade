package com.example.myhelp.BD;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


public class BD {
	private SQLiteDatabase bd;
	
	public BD(Context context){
		BDCore auxBd = new BDCore(context);
		bd = auxBd.getWritableDatabase();
	}
	
	//insere na tabela usuario
	public void addUser(String usuario, String senha, String email, String status, String tipo){
		
		//Carga dos valores
		ContentValues valores = new ContentValues();
		valores.put("usuario",usuario);
		valores.put("senha",senha);
		valores.put("email",email);
		valores.put("status",status);
		valores.put("tipo", tipo);

		//Inserção dos dados no banco de dados
		bd.insert("Usuario", null, valores);
	
	}
	
	//insere na tabela servicoContratado
	public void addSerCont(int idCli, int idUsuario, int idPrestServ, int idPrest, int idUserPrest){
		
		//Carga dos valores
		ContentValues valores = new ContentValues();
		valores.put("Cliente_idCliente",idCli);
		valores.put("Cliente_Usuario_idUsuario",idUsuario);
		valores.put("PrestadorServico_idPrestadorServico",idPrestServ);
		valores.put("PrestadorServico_Prestador_idPrestador",idPrest);
		valores.put("PrestadorServico_Prestador_Usuario_idUsuario", idUserPrest);

		//Inserção dos dados no banco de dados
		bd.insert("ServicoContratado", null, valores);
	
	}
	
	//adiciona na tabela servico
	public void addServico(String categ, String descri,String status, int idPrestServ, int idPrest, int idUser){
		
		//Carga dos valores
		ContentValues valores = new ContentValues();
		valores.put("categoria",categ);
		valores.put("descricao",descri);
		valores.put("status",status);
		valores.put("PrestadorServico_idPrestadorServico",idPrestServ);
		valores.put("PrestadorServico_Prestador_idPrestador", idPrest);
		valores.put("PrestadorServico_Prestador_Usuario_idUsuario", idUser);

		//Inserção dos dados no banco de dados
		bd.insert("Servico", null, valores);
	
}

	//insere na tabela regiao
	public void addRegiao(String nome, int idPrestServ,int idPrest, int idUser){
		
		//Carga dos valores
		ContentValues valores = new ContentValues();
		valores.put("nome",nome);
		valores.put("PrestadorServico_idPrestadorServico",idPrestServ);
		valores.put("PrestadorServico_Prestador_idPrestador",idPrest);
		valores.put("PrestadorServico_idPrestadorServico",idPrestServ);
		valores.put("PrestadorServico_Prestador_Usuario_idUsuario", idUser);

		//Inserção dos dados no banco de dados
		bd.insert("Regiao", null, valores);
	
	}
	
	//insere na tabela prestadorServico
	public void addPrestServ(int idPrest, int idUser){
		
		//Carga dos valores
		ContentValues valores = new ContentValues();
		valores.put("Prestador_idPrestador",idPrest);
		valores.put("Prestador_Usuario_idUsuario",idUser);
		

		//Inserção dos dados no banco de dados
		bd.insert("PrestadorServico", null, valores);
	
	}
	
	//insere na tabela prestador
	public void addPrestador(String nome, int tel1, int tel2, int idUser){

		//Carga dos valores
		ContentValues valores = new ContentValues();
		valores.put("nome",nome);
		valores.put("telefone1",tel1);
		valores.put("telefone2",tel2);
		valores.put("Usuario_idUsuario", idUser);
		

		//Inserção dos dados no banco de dados
		bd.insert("Prestador", null, valores);
	
	}
	
	//insere na tabela pessoaJuridica
	public void addPesJur(String rSocial,long dtFund, long cnpj, int idPrest, int idUser){
				
		//Carga dos valores
		ContentValues valores = new ContentValues();
		valores.put("razaoSocial",rSocial);
		valores.put("dataFundacao",dtFund);
		valores.put("cnpj",cnpj);
		valores.put("Prestador_idPrestador", idPrest);
		valores.put("Prestador_Usuario_idUsuario",idUser);
		

		//Inserção dos dados no banco de dados
		bd.insert("PessoaJuridica", null, valores);
	
	}

	//insere na tabela pessoaFisica
	public void addPesFis(long dtNasc, long cpf, int idPrest, int idUser){
				
		//Carga dos valores
		ContentValues valores = new ContentValues();
		valores.put("dataNascimento",dtNasc);
		valores.put("cpf",cpf);
		valores.put("Prestador_idPrestador", idPrest);
		valores.put("Prestador_Usuario_idUsuario",idUser);
		

		//Inserção dos dados no banco de dados
		bd.insert("PessoaFisica", null, valores);
	
	}
	
	//insere na tabela cliente
	public void addCliente(String nome, long cpf, long dtNasc, int tel1, int tel2, int idUser){
		
		//Carga dos valores
		ContentValues valores = new ContentValues();
		valores.put("nome", nome);
		valores.put("cpf",cpf);
		valores.put("dataNascimento",dtNasc);		
		valores.put("telefone1", tel1);
		valores.put("telefone2", tel2);
		valores.put("Prestador_Usuario_idUsuario",idUser);
		

		//Inserção dos dados no banco de dados
		bd.insert("Cliente", null, valores);
	
	}
	

	
//updates pelo id de cada tabela
	
	
	//atualiza tabela usuario
	public void updUsuario(int idx, String usuario, String senha, String email, String status, String tipo){
		
		//Atualização da linha onde id == idx
		ContentValues valores = new ContentValues();
		valores.put("usuario",usuario);
		valores.put("senha",senha);
		valores.put("email",email);
		valores.put("status",status);
		valores.put("tipo", tipo);

		//atualizando no banco
		bd.update("Usuario", valores, "idUsuario = " + idx, null);
	
	}

	//atualiza tabela servicoContratado
	public void updSerCont(int idx, int idCli, int idUsuario, int idPrestServ, int idPrest, int idUserPrest){
		
		//Atualização da linha onde id == idx
		ContentValues valores = new ContentValues();
		valores.put("Cliente_idCliente",idCli);
		valores.put("Cliente_Usuario_idUsuario",idUsuario);
		valores.put("PrestadorServico_idPrestadorServico",idPrestServ);
		valores.put("PrestadorServico_Prestador_idPrestador",idPrest);
		valores.put("PrestadorServico_Prestador_Usuario_idUsuario", idUserPrest);

		//atualizando no banco
		bd.update("PrestadorServico", valores, "idServicoContratado = " + idx, null);
	
	}

	//atualiza tabela
	public void updServico(int idx, String categ, String descri,String status, int idPrestServ, int idPrest, int idUser){
		
		//Atualização da linha onde id == idx
		ContentValues valores = new ContentValues();
		valores.put("categoria",categ);
		valores.put("descricao",descri);
		valores.put("status",status);
		valores.put("PrestadorServico_idPrestadorServico",idPrestServ);
		valores.put("PrestadorServico_Prestador_idPrestador", idPrest);
		valores.put("PrestadorServico_Prestador_Usuario_idUsuario", idUser);

		//atualizando no banco
		bd.update("Servico", valores, "idServico = " + idx, null);
	
	}	
	
	//atualiza tabela regiao
	public void updRegiao(int idx, String nome, int idPrestServ,int idPrest, int idUser){
		
		//Atualização da linha onde id == idx
		ContentValues valores = new ContentValues();
		valores.put("nome",nome);
		valores.put("PrestadorServico_idPrestadorServico",idPrestServ);
		valores.put("PrestadorServico_Prestador_idPrestador",idPrest);
		valores.put("PrestadorServico_idPrestadorServico",idPrestServ);
		valores.put("PrestadorServico_Prestador_Usuario_idUsuario", idUser);

		//atualizando no banco
		bd.update("Regiao", valores, "idRegiao = " + idx, null);
	
	}	

	//atualiza tabela prestadorServico
	public void updPrestServ(int idx, int idPrest, int idUser){
		
		//Atualização da linha onde id == idx
		ContentValues valores = new ContentValues();
		valores.put("Prestador_idPrestador",idPrest);
		valores.put("Prestador_Usuario_idUsuario",idUser);

		//atualizando no banco
		bd.update("PrestadorServico", valores, "idPrestadorServico = " + idx, null);
	
	}	

	//atualiza tabela prestador
	public void updPrestador(int idx, String nome, int tel1, int tel2, int idUser){
		
		//Atualização da linha onde id == idx
		ContentValues valores = new ContentValues();
		valores.put("nome",nome);
		valores.put("telefone1",tel1);
		valores.put("telefone2",tel2);
		valores.put("Usuario_idUsuario", idUser);

		//atualizando no banco
		bd.update("Prestador", valores, "idPrestador = " + idx, null);
	
	}	
	
	//atualiza tabela pessoaJuridica
	public void updPesJur(int idx, String rSocial,long dtFund, long cnpj, int idPrest, int idUser){
		
		//Atualização da linha onde id == idx
		ContentValues valores = new ContentValues();
		valores.put("razaoSocial",rSocial);
		valores.put("dataFundacao",dtFund);
		valores.put("cnpj",cnpj);
		valores.put("Prestador_idPrestador", idPrest);
		valores.put("Prestador_Usuario_idUsuario",idUser);
		
		//atualizando no banco
		bd.update("PessoaJuridica", valores, "idPessoaJuridica = " + idx, null);
	
	}	
	
	//atualiza tabela pessoaFisica
	public void updPesFis(int idx, long dtNasc, long cpf, int idPrest, int idUser){
		
		//Atualização da linha onde id == idx
		ContentValues valores = new ContentValues();
		valores.put("dataNascimento",dtNasc);
		valores.put("cpf",cpf);
		valores.put("Prestador_idPrestador", idPrest);
		valores.put("Prestador_Usuario_idUsuario",idUser);
		
		//atualizando no banco
		bd.update("PessoaFisica", valores, "idPessoaFisica = " + idx, null);
	
	}	
	
	//atualiza tabela cliente
public void updCliente(int idx, String nome, long cpf, long dtNasc, int tel1, int tel2, int idUser){
		
		//Atualização da linha onde id == idx
		ContentValues valores = new ContentValues();
		valores.put("nome", nome);
		valores.put("cpf",cpf);
		valores.put("dataNascimento",dtNasc);		
		valores.put("telefone1", tel1);
		valores.put("telefone2", tel2);
		valores.put("Prestador_Usuario_idUsuario",idUser);
		
		//atualizando no banco
		bd.update("Cliente", valores, "idCliente = " + idx, null);
	
	}	
	
	

//deletes pelo id de cada tabela

	//deleta registro da tabela usuario
	public void delUsuario(int idx){
		
		bd.delete("Usuario", "idUsuario = " + idx, null);
			
	}
	
	//deleta registro da tabela servicoContratado
	public void delSerCont(int idx){
		
		bd.delete("PrestadorServico", "idServicoContratado = " + idx, null);
			
	}
	
	//deleta registro da tabela servico
	public void delServico(int idx){

		bd.delete("Servico", "idServico = " + idx, null);
			
	}	

	//deleta registro da tabela Regiao
	public void delRegiao(int idx){

		bd.delete("Regiao", "idRegiao = " + idx, null);
			
	}	

	//deleta registro da tabela prestadorServico
	public void delPrestServ(int idx){

		bd.delete("PrestadorServico", "idPrestadorServico = " + idx, null);
			
	}	

	//deleta registro da tabela prestador
	public void delPrestador(int idx){

		bd.delete("Prestador", "idPrestador = " + idx, null);
			
	}	
	
	//deleta registro da tabela pessoaJuridica
	public void delPesJur(int idx){
		
		bd.delete("PessoaJuridica", "idPessoaJuridica = " + idx, null);
			
	}	

	//deleta registro da tabela pessoaFisica
	public void delPesFis(int idx){
		
		bd.delete("PessoaFisica", "idPessoaFisica = " + idx, null);
			
	}	

	//deleta registro da tabela
	public void delCliente(int idx){
		
		bd.delete("Cliente", "idCliente = " + idx, null);
			
	}	
	
	
	//teste busca
	public List<Usuario> buscar(){
		List<Usuario> list = new ArrayList<Usuario>();
		String[] colunas = new String[]{"idUsuario", "nome"};
		
		Cursor cursor = bd.query("Usuario", colunas, "idUsuario = 1", null, null, null, "nome ASC");
		
		if(cursor.getCount() > 0){
			cursor.moveToFirst();
		
		do{
			Usuario u = new Usuario();
			u.setId(cursor.getLong(0));
			u.setNome(cursor.getString(1));
			list.add(u);
			
		}while(cursor.moveToNext());
			
	}
		return(list);
	}
}













