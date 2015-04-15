package com.example.myhelp;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.app.Activity;
import android.content.Intent;


public class HomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
		// Criação do array
		final String[] nomes = {"Eletrica", "Diarista", "Pintura", "Pedreiro", "Bombeiro Hidraulico","Eletrica", "Diarista", "Pintura", "Pedreiro", "Bombeiro Hidraulico", "Eletrica", "Diarista", "Pintura", "Pedreiro", "Bombeiro Hidraulico"};
		final String[] opcoes = {"Selecione a Região","Centro", "Centro-Sul"};
		final String[] regiao = {"Selecione o Serviço", "Eletrica", "Diarista", "Pintura", "Pedreiro", "Bombeiro Hidraulico"};
		int layout = android.R.layout.simple_list_item_1;
		// Criação do adapter que contem o layout e a string para tela
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, layout, nomes);
		
		// criação da listview
		ListView lista = (ListView) findViewById(R.id.listaServicos);
		// tranferir os dados do array para o adapter
		lista.setAdapter(adapter);
		
		 Spinner Regiao = (Spinner) findViewById(R.id.opcoesregioes);
         ArrayAdapter adp = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, regiao);
         adp.setDropDownViewResource(android.R.layout.simple_spinner_item);
         Regiao.setAdapter(adp);
	
         Spinner OpcoesServ = (Spinner) findViewById(R.id.opcoeservicos);
         ArrayAdapter adp1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opcoes);
         adp1.setDropDownViewResource(android.R.layout.simple_spinner_item);
         OpcoesServ.setAdapter(adp1);
		// Metodo de verificação de clique curto para cada item da lista, utilizado somente na list view
			lista.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adapter, View view, int posicao,
					long id) {
				
				
				Intent it = new Intent(HomeActivity.this,ActivityUser.class);
		        startActivity(it);
		        //setContentView(R.layout.activity_activity_user);   	
				//Toast.makeText(HomeActivity.this, "Clique na posição "+posicao ,Toast.LENGTH_LONG).show();;
		      //fecha tela atual
				finish();
			}
			
		});
	/*
			lista.setOnItemLongClickListener(new OnItemLongClickListener() {

				@Override
				public boolean onItemLongClick(AdapterView<?> adapter, View view,
						int posicao, long id) {
					
					Toast.makeText(HomeActivity.this, "Clique longo em " + 
					nomes[posicao], Toast.LENGTH_SHORT).show();
					
					Toast.makeText(HomeActivity.this, "Clique longo em " 
					+ adapter.getItemAtPosition(posicao), Toast.LENGTH_SHORT).show();
					return true;
				}
				
			});
	
	*/	
	
	}
	
	public void onBackPressed() {
		finish();
	    //startActivity(new Intent(HomeActivity.this, MainActivity.class));

	    return;
	    }
}
