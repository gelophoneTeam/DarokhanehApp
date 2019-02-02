package com.example.malizen.darokhanehapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_A extends Fragment {


    public Frag_A() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {   View view = inflater.inflate(R.layout.frag_a, container, false);

//        Button btna = (Button) view.findViewById(R.id.btnA);
//        Button btnb = (Button) view.findViewById(R.id.btnB);
//        btna.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(getActivity(), MainActivity.class);
//                startActivity(intent);
//                // here you set what you want to do when user clicks your button,
//            }
//        });
//        btnb.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(getActivity(), Frag_B.class);
//                startActivity(intent);
//                // here you set what you want to do when user clicks your button,
//            }
//        });
//
        return view;}

}
