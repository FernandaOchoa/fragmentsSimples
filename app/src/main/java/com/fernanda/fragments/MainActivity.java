package com.fernanda.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements EnviarMensaje {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //Dentro de este metodo declaramos el elemento Derecha y utilizamos getFragmentManager para traerlo
    //Finalmente le pasamos el dato a derecha, ulitizamos el metodo obtener datos y pasamos el mensaje
    //como parametro

    public void enviarDatos(String mensaje){
        Derecha derecha = (Derecha) getFragmentManager().findFragmentById(R.id.der);
        derecha.ObtenerDatos(mensaje);
    }
}
