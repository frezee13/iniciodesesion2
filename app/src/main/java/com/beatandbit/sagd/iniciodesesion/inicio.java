package com.beatandbit.sagd.iniciodesesion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class inicio extends AppCompatActivity {

    private Button btnIniciar;
    private EditText etUsuario, etContrasena;
    private String usuario="frexzeer", contrasena="12345";
    public final static String EXTRA_MESSAGE="usuario";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        btnIniciar=(Button)findViewById(R.id.btn_iniciar);
        etUsuario=(EditText)findViewById(R.id.et_usuario);
        etContrasena=(EditText)findViewById(R.id.et_contrasena);



        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //comparar lo que ingresa el usuario con las credenciales definidas
                // ==

                if(  etUsuario.getText().toString().equals(usuario)  &&    etContrasena.getText().toString().equals(contrasena)  ){
                    //iniciar la segunda actividad
                    Intent mIntent= new Intent(  inicio.this,  sesionIniciada.class  );
                    mIntent.putExtra(EXTRA_MESSAGE, etUsuario.getText().toString()  );
                    startActivity(mIntent);
                    finish();

                }  else   {
                    //MAndar mensaje de error
                    Toast.makeText(inicio.this, "Alguno de los campos ingresados fue erroneo", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}
