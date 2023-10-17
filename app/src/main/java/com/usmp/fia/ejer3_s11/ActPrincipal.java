package com.usmp.fia.ejer3_s11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import Persona.ActPrincipalPersona;

public class ActPrincipal extends AppCompatActivity {
    ArrayList<Alumno> listaAlumnos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_principal);
        recuperarData();
    }

    public void registrarP(View view){
        Intent intent=new Intent(this,ActRegistrar.class);
        Bundle bundle= new Bundle();
        bundle.putSerializable("data",listaAlumnos);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void listarP(View view){
        Intent intent = new Intent(this,ActListarAlumnos.class);
        Bundle bundle= new Bundle();
        bundle.putSerializable("data",listaAlumnos);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    //para iniciar el layout de persona
    public void desarrolladorP(View view){
        Intent intent= new Intent(this, ActPrincipalPersona.class);
        startActivity(intent);
    }

    private void recuperarData() {
        Bundle bundle= getIntent().getExtras();
        if (bundle==null){
            listaAlumnos=new ArrayList<>();
        }else{
            listaAlumnos= (ArrayList<Alumno>) bundle.getSerializable("data");
        }
    }
}