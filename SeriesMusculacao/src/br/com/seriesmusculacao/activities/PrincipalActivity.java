package br.com.seriesmusculacao.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import br.com.seriesmusculacao.R;

public class PrincipalActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);
	}

	public void realizarLogin(View view) {
		EditText editText = (EditText) findViewById(R.id.cmpLogin);
		String login = editText.getText().toString();
		Intent it = new Intent(this, HomeActivity.class);
		it.putExtra("login", login);
		
		startActivity(it);
	}

}
