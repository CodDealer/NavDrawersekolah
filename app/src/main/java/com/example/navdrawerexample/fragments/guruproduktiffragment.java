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

public class guruproduktiffragment extends Fragment implements adapter.RecyclerViewClickListener {
    ArrayList<model> model = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_guru_produktif, container, false);
        RecyclerView recyclerView = rootview.findViewById(R.id.recyclerView);

        model.add(new model("Bpk Aji","Mobile", R.drawable.baseline_man_24));
        model.add(new model("Bpk Fahmi","Website", R.drawable.baseline_man_24));
        model.add(new model("Bpk Dwi","Informatika", R.drawable.baseline_man_24));
        model.add(new model("Bpk Agus","Desktop", R.drawable.baseline_man_24));
        model.add(new model("Bpk Anjas","Game", R.drawable.baseline_man_24));

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter adapter = new adapter(getContext(), model, this);
        recyclerView.setAdapter(adapter);

        return rootview;
    }


    @Override
    public void onClick(View view, int position) {

    }
}