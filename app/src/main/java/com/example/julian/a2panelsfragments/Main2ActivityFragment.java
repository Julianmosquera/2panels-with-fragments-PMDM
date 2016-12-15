package com.example.julian.a2panelsfragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import org.w3c.dom.Text;

/**
 * A placeholder fragment containing a simple view.
 */
public class Main2ActivityFragment extends Fragment {

    public TextView tb;

    public Main2ActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View i=inflater.inflate(R.layout.fragment_main2, container, false);
             tb= (TextView) i.findViewById(R.id.tb);
         //TextView tb=(TextView) i.findViewById(R.id.tb);
        return i;

    }

 public void cambiarTexto(String text){
       tb.setText(text);

}
}
