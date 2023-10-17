package com.usmp.fia.ejer3_s11;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    Activity activity;
    ArrayList<Alumno> listaAlu;

    public Adaptador(Activity activity,ArrayList<Alumno> listaAlu){
        this.activity=activity;
        this.listaAlu=listaAlu;
    }

    @Override
    public int getCount() {
        return listaAlu.size();
    }

    @Override
    public Object getItem(int position) {
        return listaAlu.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=convertView;
        TextView txtApePatItem,txtApeMatItem,txtNomItem,txtGen,txtCur,txtProm;
        ImageView imgFoto;
        if (v==null){
            LayoutInflater inflater= (LayoutInflater)activity.getLayoutInflater();
            v=inflater.inflate(R.layout.lyt_item_alumno,null);
        }
        txtApePatItem=v.findViewById(R.id.txtApePatItem);
        txtApeMatItem=v.findViewById(R.id.txtApeMatItem);
        txtNomItem=v.findViewById(R.id.txtNomItem);
        txtGen=v.findViewById(R.id.txtGen);
        txtCur=v.findViewById(R.id.txtCurso);
        txtProm=v.findViewById(R.id.txtProm);
        imgFoto=v.findViewById(R.id.imgFoto);
        Alumno p=listaAlu.get(position);
        txtApePatItem.setText(p.getApePat());
        txtApeMatItem.setText(p.getApeMat());
        txtNomItem.setText(p.getNom());
        txtGen.setText(p.getGen());
        txtCur.setText(p.getCur());
        txtProm.setText(p.getProm()+"");
        imgFoto.setImageResource(p.getIdFoto());
        return v;
    }
}
