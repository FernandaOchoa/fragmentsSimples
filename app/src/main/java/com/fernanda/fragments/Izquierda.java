package com.fernanda.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by monsh on 19/09/2015.
 */
public class Izquierda extends Fragment {

    View rootView;
    Button boton;
    EditText campo;
    EnviarMensaje EM;



    // Definimos la parte donde realizaremos la comunicacion utilizando tambien la clase
    //activity y el EM. Tenemos una exception que nos solicitara java para crear este tipo
    // de instrucciones.
    @Override
    public void onAttach(Activity activity) {
        //super.onAttach(context);

        super.onAttach(activity);
        try{
            EM = (EnviarMensaje) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException("Necesitas implementar un mensaje");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Indicamos de donde obtenemos la vista para el fragment, enlazamos los layouts de
        //el boton y el editText, y añadimos los eventos al boton


        rootView = inflater.inflate(R.layout.izquierda, container, false);
        campo = (EditText) rootView.findViewById(R.id.edt_campotxt);
        boton = (Button) rootView.findViewById(R.id.btn_enviar);


        //Indicamos el nombre del texto del EditText y que lo coloque en una
        //cadena que se llama mensaje, este mismo se lo pasamos al elemento que
        //llamamos EM y le pasamos este mensaje como parametro
        boton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String mensaje;
                mensaje= campo.getText().toString();
                EM.enviarDatos(mensaje);
            }
        });
        return rootView;


    }
}
