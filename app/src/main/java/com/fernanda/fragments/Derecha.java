package com.fernanda.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by monsh on 19/09/2015.
 */
public class Derecha extends android.app.Fragment {

    View rootView;
    TextView txt;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        //Indicar de donde obtendre la vista del fragmento, enlazo el textview y devolvemos la vista
        //que vamos a utilizar en la sentencia return
        rootView = inflater.inflate(R.layout.derecha, container, false);
        txt = (TextView) rootView.findViewById(R.id.tv_txt);
        return rootView;
    }
    public void ObtenerDatos(String mensaje){
        txt.setText(mensaje);
    }
}
