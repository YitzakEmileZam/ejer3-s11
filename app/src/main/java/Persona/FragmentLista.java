package Persona;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.usmp.fia.ejer3_s11.R;

import java.util.ArrayList;

public class FragmentLista extends Fragment {

    ArrayList<Persona> lista;

    ListView lstPers;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstancesState){
    View v=inflater.inflate(R.layout.lista_persona, null);
    return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        lstPers=getView().findViewById(R.id.lstPer);
        lista=new ArrayList<>();

        lista.add(new Persona(1,R.drawable.patricia,"Patricia","987456123",
                "p@gmail.com","Docente"));
        lista.add(new Persona(2,R.drawable.karen,"Kathia","987456123",
                "k@gmail.com","Cantante"));
        lista.add(new Persona(3,R.drawable.maria,"Mary","987456123",
                "m@gmail.com","Secretaria"));
        lista.add(new Persona(4,R.drawable.pedrito,"Pedrito","987456123",
                "pe@gmail.com","Ing. Sistemas"));

        ArrayList<String> nombres=new ArrayList<>();
        for(Persona p:lista){
            nombres.add(p.getNom());
        }

        ArrayAdapter<String> adapter=new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1,nombres);
        lstPers.setAdapter(adapter);
        lstPers.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ((IPersona)getActivity()).seleccionarPersona(lista.get(position));
            }
        });
    }

}
