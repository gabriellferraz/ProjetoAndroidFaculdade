package com.example.myhelp;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class CadastroActivity extends ActionBarActivity {

	private static final String[] regiao = new String[]{"Selecione a região","Barreiro", "Centro", "Centro-Sul", "Leste", "Nordeste", "Noroeste", "Norte", "Oeste", "Pampulha", "Venda Nova" };
	private static final String[] tipo = new String[]{"Selecione o tipo","Prestador", "Usuário"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastro);
		
          Spinner Regiao = (Spinner) findViewById(R.id.regiao);
          ArrayAdapter adp = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, regiao);
          adp.setDropDownViewResource(android.R.layout.simple_spinner_item);
          Regiao.setAdapter(adp);
          
          /*foi comentado apos a retirada do tipo na tela de cadastro
           * Spinner Tipo = (Spinner) findViewById(R.id.tipo);
          ArrayAdapter adp1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, tipo);
          adp.setDropDownViewResource(android.R.layout.simple_spinner_item);
          Tipo.setAdapter(adp1);*/
                 
          Button botaocadastre = (Button) findViewById(R.id.btncadastrar);
  		
          botaocadastre.setOnClickListener(new Button.OnClickListener() {
  			@Override
  			public void onClick(View v) {
  				
  				Toast.makeText(CadastroActivity.this, "Cadastrado com Sucesso, faça seu login ! ", Toast.LENGTH_SHORT).show();
  				Intent it = new Intent(CadastroActivity.this,MainActivity.class);
		        startActivity(it);
		        //setContentView(R.layout.activity_home);
		        finish(); // finaliza tela atual
		        } 	
  		
  		});
  		
          
	
	}	

	
	public void teste(View view) {
		Intent it = new Intent(CadastroActivity.this,CadastroActivity.class);
        startActivity(it);
        //setContentView(R.layout.activity_cadastro);   
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cadastro, menu);
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
	
	public void onBackPressed() {
		
	    startActivity(new Intent(CadastroActivity.this, MainActivity.class));
	    finish();
	    return;
	    }
	
}
