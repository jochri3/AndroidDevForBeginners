package com.example.lislis.mesexercices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListViewSansCustomLayout extends AppCompatActivity {


    ListView vueList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_sans_custom_layout);
        vueList=(ListView)findViewById(R.id.lst);
        final List<String> lst=new ArrayList<>();
        lst.add("Christian Lisangola");
        lst.add("Sarah Luaba");
        lst.add("Jean Francois Champollion");
        lst.add("Roi Makoko");


        ListAdapter l=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lst);
        vueList.setAdapter(l);


        vueList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),lst.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
