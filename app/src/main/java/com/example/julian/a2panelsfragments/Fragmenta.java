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
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Este es el View con el layout
        View rootView = inflater.inflate(R.layout.fragment_fragmenta, container, false);
        // recogemos el boton del layout
        Button llamaFragment = (Button) rootView.findViewById(R.id.llamaFragment);
        // le añadimos funcionalidad al 'click'
        llamaFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abreFragment();
            }
        });
        return rootView;
    }

    private void abreFragment() {
        //ponemos una TOAST para probar
        CharSequence text = "Abriendooooo...";
        int duration = Toast.LENGTH_SHORT;
        // utilizamos getActivity ya que el contexto es el de la Activity que tiene al fragment
        Toast toast = Toast.makeText(getActivity(), text, duration);
        Intent intent=new Intent(getActivity(),Fragmentb.class);
        toast.show();
        startActivity(intent);
    }

}
