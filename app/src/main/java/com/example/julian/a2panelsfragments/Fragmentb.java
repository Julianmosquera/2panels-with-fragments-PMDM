package com.example.julian.a2panelsfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmentb extends Fragment {


    public Fragmentb() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rv = inflater.inflate(R.layout.fragmentb, container, false);
        TextView tes= (TextView) rv.findViewById(R.id.adios);
        return rv;
    }

}
