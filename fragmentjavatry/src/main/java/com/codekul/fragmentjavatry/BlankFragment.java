package com.codekul.fragmentjavatry;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_blank, container, false);
//        view.findViewById(R.id.RED)
//                .setOnClickListener(
//                        new View.OnClickListener() {
//                            @Override
//                            public void onClick(View v) {
//                                ((MainActivity) getActivity()).loadFragment(new REDFragment());
//                            }
//                        }
//                );
        view.findViewById(R.id.RED)
                .setOnClickListener(v -> ((MainActivity) getActivity()).loadFragment(new REDFragment()));
        view.findViewById(R.id.GREEn)
                .setOnClickListener(v -> ((MainActivity) getActivity()).loadFragment(new GREENFragment()));

//        view.findViewById(R.id.GREEn)
//                .setOnClickListener(
//                        new View.OnClickListener() {
//                            @Override
//                            public void onClick(View v) {
//                                ((MainActivity) getActivity()).loadFragment(new GREENFragment());
//                            }
//                        }
//                );
        return view;
    }

}
