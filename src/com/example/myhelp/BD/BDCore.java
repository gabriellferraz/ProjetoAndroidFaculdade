package com.example.myhelp.BD;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class BDCore extends SQLiteOpenHelper{
	private static final String NOME_BD = "tidir";
	private static final int VERSAO_BD = 21;
		
		
	public BDCore(Context context){
		super((Context) context, NOME_BD, null, VERSAO_BD);
	}

	@Override
	public void onCreate(SQLiteDatabase bd) {
		bd.execSQL("create table Usuario(idUsuario integer primary key autoincrement, usuario text unique not null, senha text not null, email text unique not null, status text not null, tipo text not null);");
		bd.execSQL("create table Prestador(idPrestador integer primary key autoincrement, nome text not null, telefone1 text not null, telefone2 text, idUsuario integer, FOREIGN KEY (idUsuario) REFERENCES Usuario(idUsuario));");
		bd.execSQL("create table PessoaJuridica(idPessoaJuridica integer primary key autoincrement, razaoSocial text not null, dataFundacao text not null, cnpj text unique not null, idPrestador integer, idUsuario integer, FOREIGN KEY (idPrestador) REFERENCES Prestador(idPrestador), FOREIGN KEY (idUsuario) REFERENCES Usuario(idUsuario));");
		bd.execSQL("create table PessoaFisica(idPessoaFisica integer primary key autoincrement, dataNascimento text not null, cpf text unique not null, idPrestador integer,  idUsuario integer, FOREIGN KEY (idPrestador) REFERENCES Prestador(idPrestador), FOREIGN KEY (idUsuario) REFERENCES Usuario(idUsuario));");
		bd.execSQL("create table PrestadorServico(idPrestadorServico integer primary key autoincrement, idPrestador integer, idUsuario integer, FOREIGN KEY (idPrestador) REFERENCES Prestador (idPrestador), FOREIGN KEY (idUsuario) REFERENCES Usuario(idUsuario));");
		bd.execSQL("create table Regiao(idRegiao integer primary key autoincrement, nome text unique not null,idPrestadorServico integer, idUsuario integer, idPrestador integer, FOREIGN KEY (idPrestadorServico) REFERENCES PrestadorServico (idPrestadorServico), FOREIGN KEY (idUsuario) REFERENCES Usuario (idUsuario), FOREIGN KEY (idPrestador) REFERENCES Prestador (idPrestador));");
		bd.execSQL("create table Servico(idServico integer primary key autoincrement, categoria text unique not null, descricao text not null, status text not null, idPrestadorServico integer, idPrestador integer, idUsuario integer, FOREIGN KEY (idPrestadorServico) REFERENCES PrestadorServico (idPrestadorServico), FOREIGN KEY (idUsuario) REFERENCES Usuario (idUsuario), FOREIGN KEY (idPrestador) REFERENCES Prestador (idPrestador));");
		bd.execSQL("create table Cliente(idCliente integer primary key autoincrement, nome text unique not null, cpf text unique not null, dataNascimento text not null, telefone1 text not null, telefone2 text, idUsuario integer, FOREIGN KEY (idUsuario) REFERENCES Usuario(idUsuario));");
		bd.execSQL("create table ServicoContratado(idServicoContratado integer primary key autoincrement, idCliente integer, idUsuario integer, idPrestadorServico integer, idPrestador integer, idUsuarioPrest integer,FOREIGN KEY (idCliente) REFERENCES Cliente(idCliente), FOREIGN KEY (idUsuario) REFERENCES Usuario(idUsuario), FOREIGN KEY (idPrestadorServico) REFERENCES PrestadorServico(idPrestadorServico),  FOREIGN KEY (idPrestador) REFERENCES Prestador(idPrestador), FOREIGN KEY (idUsuarioPrest) REFERENCES Prestador(idUsuario));");  
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase bd, int oldVersion, int newVersion) {
		bd.execSQL("drop table Usuario");
		bd.execSQL("drop table Prestador");
		bd.execSQL("drop table PessoaJuridica");
		bd.execSQL("drop table PessoaFisica");
		bd.execSQL("drop table PrestadorServico");
		bd.execSQL("drop table Regiao");
		bd.execSQL("drop table Servico");
		bd.execSQL("drop table Cliente");
		bd.execSQL("drop table ServicoContratado");
		onCreate(bd);
		
	}
	

}















