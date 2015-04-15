package com.example.myhelp;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.Activity;
import android.content.Intent;


public class ServicosActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
		// Criação do array
		final String[] nomes = {"Eletrica - Dia 28/10 ", "Diarista - Dia 29/10"};
		
		int layout = android.R.layout.simple_list_item_1;
		// Criação do adapter que contem o layout e a string para tela
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, layout, nomes);
		
		// criação da listview
		ListView lista = (ListView) findViewById(R.id.listaServicos);
		// tranferir os dados do array para o adapter
		lista.setAdapter(adapter);
		
		// Metodo de verificação de clique curto para cada item da lista, utilizado somente na list view
			lista.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adapter, View view, int posicao,
					long id) {
				
				
				Intent it = new Intent(ServicosActivity.this,ActivityUser.class);
		        startActivity(it);
		        //setContentView(R.layout.activity_activity_user);   
		      //fecha tela atual
				finish();
				
			}
			
		});

	
	}
	
	public void onBackPressed() {
		
	    startActivity(new Intent(ServicosActivity.this, MainActivity.class));
	    finish();

	    return;
	    }
}
