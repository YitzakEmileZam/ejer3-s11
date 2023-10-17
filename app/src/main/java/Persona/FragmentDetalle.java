package Persona;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.usmp.fia.ejer3_s11.R;

public class FragmentDetalle extends Fragment {
    TextView txtNombrePer,txtCelPer,txtCorrePer,txtProfePer;
    ImageView imgFotoPer;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.detalle_persona,container,false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txtNombrePer=getView().findViewById(R.id.txtNombreP);
        txtCelPer=getView().findViewById(R.id.txtCelP);
        txtCorrePer=getView().findViewById(R.id.txtCorreP);
        txtProfePer=getView().findViewById(R.id.txtProfeP);
        imgFotoPer=getView().findViewById(R.id.imgFotoP);
    }

    public void mostrarDatos(Persona p){
        txtNombrePer.setText(p.getNom());
        txtCelPer.setText(p.getCel());
        txtCorrePer.setText(p.getCorreo());
        txtProfePer.setText(p.getProfesion());
        imgFotoPer.setImageResource(p.getImgId());
    }
}
