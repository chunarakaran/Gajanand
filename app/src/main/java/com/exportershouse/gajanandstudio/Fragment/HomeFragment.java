package com.exportershouse.gajanandstudio.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.exportershouse.gajanandstudio.R;

/**
 * Created by Shrey on 13-02-2018.
 */

public class HomeFragment extends Fragment
{


    View rootview;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.home_fragment, container, false);

        getActivity().setTitle("Home");


        return rootview;
    }



}
