package com.filzah.wesantai.bottomnav;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.filzah.wesantai.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class NavHome extends Fragment {


    public NavHome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.nav_home, container, false);
    }

}
