package com.example.sky_k.cliente;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActividadMenuPrincipal extends AppCompatActivity {

    private String usuarioLogeado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_menu_principal);
        Intent lanzador = getIntent();
        usuarioLogeado = lanzador.getStringExtra("usuario_log");
        TextView usuario = (TextView) findViewById(R.id.tv_txt_usuario_menuPrincipal);
        usuario.setText(usuarioLogeado);

        Button btnMuro =  (Button) findViewById(R.id.btn_Muro);
        Button btnPostear =  (Button) findViewById(R.id.btn_Postear);
        btnMuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =  new Intent(getApplicationContext(), HomeActivity.class);
                i.putExtra("user", usuarioLogeado);
                startActivity(i);
            }
        });

        btnPostear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =  new Intent(getApplicationContext(), PostActivity.class);
                i.putExtra("user", usuarioLogeado);
                startActivity(i);
            }
        });
    }
}
