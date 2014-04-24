package br.com.seriesmusculacao.fragments;

import br.com.seriesmusculacao.R;
import br.com.seriesmusculacao.activities.GrupoMuscularActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.AdapterView.OnItemClickListener;

public class LoginFragment extends Fragment implements OnClickListener {

	private EditText campoUsuario;
	private EditText campoSenha;
	private Button botaoContinuar;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.login, container, false);
	}
	
	@Override
	public void onStart() {
		super.onStart();
		
		campoUsuario = (EditText) getActivity().findViewById(R.id.cmpLogin);
		campoSenha = (EditText) getActivity().findViewById(R.id.cmpPassword);
		
		botaoContinuar = (Button) getActivity().findViewById(R.id.btLogin);
		
		botaoContinuar.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		String login = botaoContinuar.getText().toString();
		Intent it = new Intent(this, GrupoMuscularActivity.class);
		it.putExtra("login", login);
		
		startActivity(it);
	}
	
}
