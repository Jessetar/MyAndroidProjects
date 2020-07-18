package com.jessetar.quest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class class3 extends AppCompatActivity {

    RecyclerView recyclerView3;
    public static List<PDFModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class3);

        recyclerView3 = findViewById(R.id.RV);

        list = new ArrayList<>();
        list.add(new PDFModel("This is CLASS 3","class 3 will open"));

        recyclerView3.setLayoutManager(new GridLayoutManager(this,2));

        ItemClickListener itemClickListener = new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                Intent intent = new Intent(class3.this, list_class3.class);
                //intent.putExtra("url",list.get(position).getPdfUrl());
                intent.putExtra("position",position);
                startActivity(intent);
            }
        };

        PDFAdapter adapter = new PDFAdapter(list,this,itemClickListener);
        recyclerView3.setAdapter(adapter);
    }
}