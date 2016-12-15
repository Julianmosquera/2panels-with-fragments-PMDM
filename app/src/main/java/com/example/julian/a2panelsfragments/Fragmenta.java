package com.example.julian.a2panelsfragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;



public class Fragmenta extends Fragment {



    Comunicador comunicador;

    public interface Comunicador{
        public void mensaje(String tb);
    }

    public void onAttach(Context contexto){
        super.onAttach(contexto);
        comunicador = (Comunicador)contexto;
}


 Button btnHi;
    View fragmentoPrincipal;
final static String FRASE = "Hi world!";






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Este es el View con el layout
        View rootView = inflater.inflate(R.layout.fragment_fragmenta, container, false);
        // recogemos el boton del layout
        Button llamaFragment = (Button) rootView.findViewById(R.id.llamaFragment);
        // le añadimos funcionalidad al 'click'
        llamaFragment.setOnClickListener (new View.OnClickListener() {

          @Override
            public void onClick(View v){
              if(getResources().getBoolean(R.bool.twoPaneMode)){
                Toast.makeText(getActivity(), "Port", Toast.LENGTH_LONG).show();
                  Intent intent=new Intent(getActivity(),Main2Activity.class);
                  startActivity(intent);


              }else {



                  Toast.makeText(getActivity(), "Land", Toast.LENGTH_LONG).show();
              }
            }


        });
        return rootView;
    }




}
