package com.example.myhelp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ActivityContratados extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_contratados);
		
		// Criação do array
		final String[] contratados = {"Eletrica", "Diarista", "Pintura", "Pedreiro"};
		
		int layout = android.R.layout.simple_list_item_1;
		// Criação do adapter que contem o layout e a string para tela
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, layout, contratados);
		
		// criação da listview
		ListView lista = (ListView) findViewById(R.id.listaContratados);
		// tranferir os dados do array para o adapter
		lista.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_contratados, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
