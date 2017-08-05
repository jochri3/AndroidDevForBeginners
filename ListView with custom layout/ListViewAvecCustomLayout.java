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
import java.util.List;

public class ListViewAvecCustomLayout extends AppCompatActivity {


    ListView vueList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_sans_custom_layout);
        final List<String> lst=new ArrayList<>();
        vueList=(ListView)findViewById(R.id.lst);
        lst.add("Christian Lisangola Bondjali");
        lst.add("Sarah Luaba Lumingu");
        lst.add("Philippe Makita");
        lst.add("Sonday Smith");


        ListAdapter l=new ArrayAdapter<String>(this,R.layout.vue_text_pour_listview,R.id.txt,lst);
        vueList.setAdapter(l);
        
        vueList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),"Nom: "+lst.get(position),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
