package com.example.kuis_1718071;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> keluargaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_1);
        adapter = new KeluargaAdapter(keluargaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData(){
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga ("Sukimin","Abah", R.drawable.abah));
        keluargaArrayList.add(new Keluarga("Wartini","Ibuk", R.drawable.ibuk));
        keluargaArrayList.add(new Keluarga("Tina Tri Hartini", "Kakak", R.drawable.mbak));
        keluargaArrayList.add(new Keluarga("Tutut Suryani", "Adik", R.drawable.saya));
    }
}

