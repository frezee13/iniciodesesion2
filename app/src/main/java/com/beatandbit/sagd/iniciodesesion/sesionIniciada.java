package com.beatandbit.sagd.iniciodesesion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.beatandbit.sagd.iniciodesesion.inicio.EXTRA_MESSAGE;

public class sesionIniciada extends AppCompatActivity {

    private TextView tvMessage;
    private Button btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion_iniciada);

        tvMessage=(TextView)findViewById(R.id.tv_mensaje);
        btnSalir=(Button)findViewById(R.id.btn_salir);

        Intent mIntent = getIntent();
        String mensaje = mIntent.getStringExtra(EXTRA_MESSAGE);
        tvMessage.setText(  "¡Bienvenido " + mensaje + " !"   );

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mIntent2= new Intent( sesionIniciada.this,inicio.class);
                startActivity(mIntent2);
                finish();

            }
        });


















    }
}
