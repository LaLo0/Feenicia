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

    public final String TAG = "MONITOR";

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
                //Se obtienen los datos que se ingresan en el layout
                String username = user.getText().toString();
                String password = pass.getText().toString();

                if (username.equals("lalo") && password.equals("admin")) {
                    //Mensaje en Android monitor
                    Log.d(TAG, "Has iniciado sesion con exito " + username);
                    //Abre nuevo activity
                    Intent intent = new Intent(v.getContext(), MenuUsuario.class);
                    startActivityForResult(intent, 0);
                } else {
                    //Mensaje Error
                    Toast.makeText(getApplicationContext(), "Usuario incorrecto, estas pendeje", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
