package com.example.pertemuanketiga;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<modelPahlawan> modelPahlawans = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rvPahlawan);
        recyclerView.setHasFixedSize(true);
        modelPahlawans.addAll(dataPahlawan.getListData());

        showRecyclerList();
    }

    private void showRecyclerList(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AdapterPahlawan adapterPahlawan = new AdapterPahlawan(this);
        adapterPahlawan.setModelPahlawan(modelPahlawans);
        recyclerView.setAdapter(adapterPahlawan);
    }
}
