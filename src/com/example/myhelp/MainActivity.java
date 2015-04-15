package com.example.myhelp;



import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Inicia tela principal
		setContentView(R.layout.activity_main);
		
		
		final EditText login;
		final EditText senha;
		
		login = (EditText) findViewById(R.id.txtlogin);
		senha = (EditText) findViewById(R.id.txtsenha);
		Button botaoentrar = (Button) findViewById(R.id.btnentrar);
		Button botaocadastre = (Button) findViewById(R.id.btnCadastre);
		
		
		
		botaoentrar.setOnClickListener(new Button.OnClickListener() {
			@Override
			//verifica o clique no botao entrar
			public void onClick(View v) {
				
				String login2 = login.getText().toString();
				String senha2 = senha.getText().toString();
				// TODO Auto-generated method stub
				//Toast.makeText(MainActivity.this, "Login: " + login2 + " Senha: "+senha2, Toast.LENGTH_SHORT).show();
				
				if(login2.equals("Gabriel") && senha2.equals("123") || login2.equals("Rodolfo") && senha2.equals("123") || login2.equals("x") && senha2.equals("x")){
					
					// Chama nova tela
					Intent it = new Intent(MainActivity.this,HomeActivity.class);
			        startActivity(it);
			        //setContentView(R.layout.activity_home);   
			      //finaliza tela atual
					finish();
				}
				else{
					Toast.makeText(MainActivity.this, "Login ou Senha Inválidos ", Toast.LENGTH_SHORT).show();
				}
				
			}
		});
		
		//verifica o clique no botao cadastre
		botaocadastre.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View v) {
				
				
				Intent it = new Intent(MainActivity.this,CadastroActivity.class);
		        startActivity(it);
		        //setContentView(R.layout.activity_cadastro);
		        finish(); // finaliza tela atual
				
				//salvabanco(); 
		         	
			}
		
		});
		
	}
	
	/*public void salvabanco(){
		BD bd = new BD(this);
		bd.addUser("christian","123", "email@gmail.com", "I", "P");
				
	}*/
		
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Carrega menu
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
