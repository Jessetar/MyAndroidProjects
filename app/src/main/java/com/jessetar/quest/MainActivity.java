package com.jessetar.quest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    public static List<PDFModel> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.RV);

        list = new ArrayList<>();
        list.add(new PDFModel("CLASS 1","click to open the class"));
        list.add(new PDFModel("CLASS 2","click to open the class"));
        list.add(new PDFModel("CLASS 3","click to open the class"));
        list.add(new PDFModel("CLASS 4","click to open the class"));


        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        ItemClickListener itemClickListener = new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {

               //start checking to see whats clicked
                if (position == 0) {

                    Intent intent = new Intent(MainActivity.this, class1.class);
                    //intent.putExtra("url",list.get(position).getPdfUrl());
                    //intent.putExtra("position",position);
                    startActivity(intent);
                }


                else if (position ==1) {

                    Intent intent = new Intent(MainActivity.this, class2.class);
                    //intent.putExtra("url",list.get(position).getPdfUrl());
                   // intent.putExtra("position",position);
                    startActivity(intent);
                }


                else if (position ==2) {

                    Intent intent = new Intent(MainActivity.this, class3.class);
                    //intent.putExtra("url",list.get(position).getPdfUrl());
                    // intent.putExtra("position",position);
                    startActivity(intent);
                }

                else if (position ==3) {

                    Intent intent = new Intent(MainActivity.this, class4.class);
                    //intent.putExtra("url",list.get(position).getPdfUrl());
                    // intent.putExtra("position",position);
                    startActivity(intent);
                }



            }
        };

       PDFAdapter adapter = new PDFAdapter(list,this,itemClickListener);
        recyclerView.setAdapter(adapter);
    }
}
