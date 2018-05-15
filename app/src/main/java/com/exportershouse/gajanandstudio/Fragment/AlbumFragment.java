package com.exportershouse.gajanandstudio.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.exportershouse.gajanandstudio.Adapter.RecyclerAdapter;
import com.exportershouse.gajanandstudio.R;

/**
 * Created by Shrey on 13-02-2018.
 */

public class AlbumFragment extends Fragment
{

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;


    View rootview;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.album_fragment, container, false);

        getActivity().setTitle("Album");

        recyclerView = (RecyclerView) rootview.findViewById(R.id.recyclerview1);

        layoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerAdapter();
        recyclerView.setAdapter(adapter);



        return rootview;
    }



}
