package Persona;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.usmp.fia.ejer3_s11.R;

public class ActPrincipalPersona extends AppCompatActivity implements IPersona {

    FragmentLista fragmentLista;

    FragmentDetalle fragmentDetalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_persona);
        asignarReferencias();
    }

    public void asignarReferencias(){
        fragmentLista= (FragmentLista)getSupportFragmentManager().findFragmentById(R.id.fgtLista);
        fragmentDetalle= (FragmentDetalle) getSupportFragmentManager().findFragmentById(R.id.fgtDetalle);
    }

    @Override
    public void seleccionarPersona(Persona p){
        fragmentDetalle.mostrarDatos(p);
    }

    public void principalAlumP(View view){
        Intent intent= new Intent(this, com.usmp.fia.ejer3_s11.ActPrincipal.class);
        startActivity(intent);
    }
}
