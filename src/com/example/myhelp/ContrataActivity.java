package com.example.myhelp;

// tela para confirmacao da contratação


import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class ContrataActivity extends ActionBarActivity {

//private static final String[] data = new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
//private static final String[] hora = new String[]{"09:00","10:00","11:00","12:00","13:00","14:00","15:00","16:00","17:00","18:00"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contrata);
		
		//Spinner Data = (Spinner) findViewById(R.id.Data2);
        //ArrayAdapter adp = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data);
        //adp.setDropDownViewResource(android.R.layout.simple_spinner_item);
       //Data.setAdapter(adp);
        
        //Spinner Hora = (Spinner) findViewById(R.id.Hora2);
        //ArrayAdapter adp1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, hora);
       // adp.setDropDownViewResource(android.R.layout.simple_spinner_item);
        //Hora.setAdapter(adp1);
        
        Button botaonao = (Button) findViewById(R.id.btnContrata);
    	
		botaonao.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View v) {
				
				//mensagem de confirmação
		         Toast.makeText(ContrataActivity.this, "Serviço não contratado!", Toast.LENGTH_SHORT).show();
				
				
				Intent it = new Intent(ContrataActivity.this,HomeActivity.class);
		        startActivity(it);
		        //setContentView(R.layout.activity_home);
		        finish(); // finaliza tela atual
			}
		});
			
			Button botaosim = (Button) findViewById(R.id.btnContrata2);
	    	
			botaosim.setOnClickListener(new Button.OnClickListener() {
				@Override
				public void onClick(View v) {
					
					//mensagem de confirmação
			         Toast.makeText(ContrataActivity.this, "Confirmação realizada com sucesso!", Toast.LENGTH_SHORT).show();
					
					
					Intent it = new Intent(ContrataActivity.this,HomeActivity.class);
			        startActivity(it);
			        //setContentView(R.layout.activity_home);
			        finish(); // finaliza tela atual
			        }
	}); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.contrata, menu);
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
			
		    startActivity(new Intent(ContrataActivity.this, ActivityUser.class));
		    finish();
		    return;
		    }
}
