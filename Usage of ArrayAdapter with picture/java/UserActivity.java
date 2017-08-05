package com.example.lislis.mesexercices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        List<User> users=new ArrayList<>();
        users.add(new User("Lisangola","Christian","Developpeur",R.drawable.chris));
        users.add(new User("Lisangola","Denis","Medecin",R.drawable.papa));
        users.add(new User("Luaba","Sarah","Architect",R.drawable.chris2));


        ListView maVue=(ListView)findViewById(R.id.maVue);
        UserAdapter user=new UserAdapter(UserActivity.this,users);
        maVue.setAdapter(user);

    }
}
