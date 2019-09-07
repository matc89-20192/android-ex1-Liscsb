package matc89.exercicio1;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.*;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {
    EditText editNome;
    Button btnCumprimentar;
    TextView labelMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = (EditText) findViewById(R.id.editNome);
        labelMensagem = (TextView) findViewById(R.id.labelMensagem);
        btnCumprimentar = (Button) findViewById(R.id.btnCumprimentar);

        if (savedInstanceState != null) {
            String label = savedInstanceState.getString("label");
            labelMensagem.setText(label);
        }

        btnCumprimentar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String nome = editNome.getText().toString();
                String label = "Alô, ";
                label+= nome;
                label+= "!";
                labelMensagem.setText(label);
            }
        });

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("label", labelMensagem.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String label = savedInstanceState.getString("label");

    }



}
