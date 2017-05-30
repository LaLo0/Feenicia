package com.serti.miExamen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText user = (EditText) findViewById(R.id.user);
        final EditText pass = (EditText) findViewById(R.id.pass);
        Button Bingresa = (Button) findViewById(R.id.Bingresa);


        Bingresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.length() == 0 || pass.length() == 0) {

                    Toast datos = Toast.makeText(getApplicationContext(), "Faltan datos", Toast.LENGTH_LONG);
                    datos.show();

                } else {
                    //Toast datos1 = Toast.makeText(getApplicationContext(), "Datos OK", Toast.LENGTH_LONG);
                    //datos1.show();
                    //Intent intent = new Intent(v.getContext(), MenuUsuario.class);
                    //startActivityForResult(intent, 0);

                    //if(user.getText().toString().isEmpty() && pass.getText().toString() == "admin"){

                    if (user.equals("lalo") && pass.equals("admin")) {
                        Log.d("TAG", "Has iniciado sesion con exito " + user.getText().toString());
                        Toast datos1 = Toast.makeText(getApplicationContext(), "Bienvenido: " + user.getText().toString(), Toast.LENGTH_LONG);
                        datos1.show();

                        Intent intent = new Intent(v.getContext(), MenuUsuario.class);
                        startActivityForResult(intent, 0);
                    } else {
                        Toast datos2 = Toast.makeText(getApplicationContext(), "Usuario incorrecto, estas pendeje", Toast.LENGTH_LONG);
                        datos2.show();
                    }
                }
            }
        });
    }
}
