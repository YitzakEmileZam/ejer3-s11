package com.usmp.fia.ejer3_s11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ActListarAlumnos extends AppCompatActivity {

    ArrayList<Alumno> listaAlumnos;
    ListView lstListaAlu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_listar_alumnos);
        asignarReferencia();
        recuperarData();
        listarAlumnos();
    }

    private void listarAlumnos() {
        Adaptador adaptador=new Adaptador(this,listaAlumnos);
        lstListaAlu.setAdapter(adaptador);
    }

    private void recuperarData() {
        Bundle bundle=getIntent().getExtras();
        if(bundle==null){
            Toast.makeText(this, "Falta registrar datos",
                            Toast.LENGTH_SHORT).show();
        }else{
            listaAlumnos=(ArrayList<Alumno>)bundle.getSerializable("data");
        }
    }

    private void asignarReferencia() {

        lstListaAlu=findViewById(R.id.lstAlu);
    }

    public void regresarPP(View view){
        Intent intent= new Intent(this,ActPrincipal.class);
        Bundle bundle= new Bundle();
        bundle.putSerializable("data",listaAlumnos);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
