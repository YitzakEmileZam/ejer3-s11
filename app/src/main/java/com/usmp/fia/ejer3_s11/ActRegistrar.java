package com.usmp.fia.ejer3_s11;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ActRegistrar extends AppCompatActivity {

    ArrayList<Alumno> listaAlumnos;
    EditText edtApePat,edtApeMat,edtNom;
    RadioButton rbtMas,rbtFem;
    Spinner sprCur,sprProm;

    String cursos[]={"Android","Spring Boot","PHP","Kotlin"};
    String notas[]=new String[21];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_registrar);
        asignarReferencia();
        recuperarData();
    }

    private void asignarReferencia() {
        edtNom=findViewById(R.id.txtNom);
        edtApePat=findViewById(R.id.txtApePat);
        edtApeMat=findViewById(R.id.txtApeMat);
        rbtMas=findViewById(R.id.rbtMas);
        rbtFem=findViewById(R.id.rbtFem);
        sprCur=findViewById(R.id.sprCur);
        sprProm=findViewById(R.id.sprProm);
        ArrayAdapter adapter=new ArrayAdapter<String>(this,
                                                        android.R.layout.simple_list_item_1,
                                                        cursos);
        sprCur.setAdapter(adapter);
        for(int i=0;i<=20;i++){
            notas[i]=i+"";
        }
        ArrayAdapter adapterN=new ArrayAdapter(this,
                                                android.R.layout.simple_list_item_1,
                                                notas);
        sprProm.setAdapter(adapterN);
    }

    private void recuperarData() {
        Bundle bundle= getIntent().getExtras();
        if (bundle==null){
            listaAlumnos=new ArrayList<>();
        }else{
            listaAlumnos= (ArrayList<Alumno>)bundle.getSerializable("data");
        }
    }

    public void registrar(View view){
        String nom,apePat,apeMat,cur,gen;
        double prom;
        int idFoto=0;
        nom=edtNom.getText().toString();
        apePat=edtApePat.getText().toString();
        apeMat=edtApeMat.getText().toString();
        cur=sprCur.getSelectedItem().toString();
        prom=sprProm.getSelectedItemPosition();
        if(rbtMas.isChecked()){
            gen="Masculino";
        }else{
            gen="Femenino";
        }
        switch (nom){
            case "maria": idFoto=R.drawable.maria; break;
            case "karen": idFoto=R.drawable.karen; break;
            case "pedrito": idFoto=R.drawable.pedrito; break;
        }
        listaAlumnos.add(new Alumno(idFoto,apePat,apeMat,nom,cur,gen,prom));
        limpiar();
    }

    private void limpiar() {
        edtNom.setText("");
        edtApePat.setText("");
        edtApeMat.setText("");
        sprCur.setSelection(0);
        sprProm.setSelection(0);
        edtApePat.requestFocus();
        edtApeMat.requestFocus();
    }

    public void regresarPrincipal(View view){
        Intent intent= new Intent(this,ActPrincipal.class);
        Bundle bundle= new Bundle();
        bundle.putSerializable("data",listaAlumnos);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}
