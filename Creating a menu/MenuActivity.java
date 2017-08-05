package com.example.lislis.premier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    //Pour avoir ces deux methodes,on a fait:
    //=>Clique-droit=>Generate=>Override methodes=>
    //On cherche 2 methodes: "onCreateOptionsMenu" et "onOptionsItemSelected"

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.mon_menu,menu);
        return super.onCreateOptionsMenu(menu);//Or return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.settings:
                Toast.makeText(MenuActivity.this,"Now you can configure",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.about:
                Toast.makeText(MenuActivity.this,"Know more about us",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.contact:
                Toast.makeText(MenuActivity.this,"You can contact us babe!!!",Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
