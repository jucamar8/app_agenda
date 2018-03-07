package com.local.agenda.utils;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;

import com.local.agenda.Contacto;
import com.local.agenda.R;

/**
 * Created by user on 07/03/2018.
 */

public class BuscarContacto extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void buscar(View v){
        String email=((EditText)this.findViewById(R.id.editTextBuscar)).getText().toString();
        //guardamos aquí el contacto recuperado
        Contacto c=null;
        //creamos GestionContacto y buscamos
        DBContactos gestion=new DBContactos(this);
        c=gestion.buscarPorEmail(email);
        mostrarDato(c);
        //cerramos la base de datos
        gestion.close();
    }

}
