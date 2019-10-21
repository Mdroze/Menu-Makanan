package com.example.aplikasimenumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    makananAdapter adapter;
    ArrayList<makanan> makananArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        adapter = new makananAdapter(MainActivity.this,makananArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }

    void addData()
    {
        makananArrayList = new ArrayList<>();

        makananArrayList.add(
                new makanan(
                        1,
                        "Bubble Tea",
                        "25000",
                        "boba",
                        "Sebuah Minuman mirip cendol dawet tapi mahal"

                )
        );
        makananArrayList.add(
                new makanan(
                        2,
                        "Bakso",
                        "15000",
                        "bakso",
                        "Bakso merupakan makanan olahan daging sapi"
                )
        );
        makananArrayList.add(
                new makanan(
                        3,
                        "Ayam geprek keju",
                        "20000",
                        "ayam",
                        "Ayam geprek tapi keju dipisah"
                )
        );
        makananArrayList.add(
                new makanan(
                        4,
                        "Katsu ayam",
                        "17500",
                        "katsu",
                        "Ayam tepung jepang"
        ));
        makananArrayList.add(
                new makanan(
                        5,
                        "Thai Tea",
                        "15000",
                        "tea",
                        "Minuman teh yang lebih mahal dari es teh"
                ));
        makananArrayList.add(
                new makanan(
                        6,
                        "Salad buah",
                        "12000",
                        "salad",
                        "Buah buahan campur"
        ));
    }
}
