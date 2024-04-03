package com.example.navdrawerexample.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navdrawerexample.adapter;
import com.example.navdrawerexample.model;
import com.example.navdrawerexample.R;

import java.util.ArrayList;

public class muridfragment extends Fragment implements adapter.RecyclerViewClickListener {
    ArrayList<model> model = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_murid, container, false);
        RecyclerView recyclerView = rootview.findViewById(R.id.recyclerView);

        model.add(new model("Adli","10PPLG2", R.drawable.baseline_person_24));
        model.add(new model("Miqdam","10PPLG2", R.drawable.baseline_person_24));
        model.add(new model("Firasi","10PPLG2", R.drawable.baseline_person_24));
        model.add(new model("Simatahari","10PPLG2", R.drawable.baseline_person_24));
        model.add(new model("Caesar","10PPLG2", R.drawable.baseline_person_24));
        model.add(new model("Bitriq","10PPLG2", R.drawable.baseline_person_24));
        model.add(new model("Raihan","10PPLG2", R.drawable.baseline_person_24));
        model.add(new model("Yusuf","10PPLG2", R.drawable.baseline_person_24));
        model.add(new model("Wisnu","10PPLG2", R.drawable.baseline_person_24));

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter adapter = new adapter(getContext(), model, this);
        recyclerView.setAdapter(adapter);

        return rootview;
    }


    @Override
    public void onClick(View view, int position) {

    }
}