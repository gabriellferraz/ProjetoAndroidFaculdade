package com.example.myhelp;

//tela com detalhes do servico

import java.util.Random;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityDetalhes extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_contratados);
		
		Button botaocontrata = (Button) findViewById(R.id.Avaliar);
		Random random = new Random(); 
		String texto[] = {"Serviço de ótima Qualidade: Atendo em todas as Regiões na Região Central, Cel para Contato: 2222-3333",
						  "Atendo em todas as Regiões, parcelo o serviço em 12 vezes. Cel para Contato: 5555-8888",
						  "Atendo Somente na Região Centro-Sul. Caso queria agendar entre em contato no Tel 3333-3333",
						  "Atendo em todas as Regiões, parcelo o serviço em até 6 vezes. Cel para Contato: 5555-2222",
						  "A cada indicação você ganha 5 % de Desconto. Entre em contato através do cel 6565-8787",
						  "Serviço de ótima qualidade: atendo de segunda a segunda. Contato pelo cel 9999-8888",
						  "Atendo todas as regiões durante a semana e final de semana somente Centro-Sul. Telefone 8895-9090"
						 };  
		String selecao = texto[random.nextInt(texto.length)];
		
		EditText text = (EditText) findViewById(R.id.editText1);
		text.setText(selecao);
		
		botaocontrata.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View v) {
				
				
				Intent it = new Intent(ActivityDetalhes.this,ContrataActivity.class);
		        startActivity(it);
		        //setContentView(R.layout.activity_contrata);
		        finish(); // finaliza tela atual
			}
	});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_user, menu);
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
	
	//voltar a tela home
	public void onBackPressed() {
		
	    startActivity(new Intent(ActivityDetalhes.this, HomeActivity.class));
	    finish();
	    return;
	    }
	
}
