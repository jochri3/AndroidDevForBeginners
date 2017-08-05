package com.example.lislis.mesexercices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MotListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        final List<Mot> mot=new ArrayList<>();
        mot.add(new Mot("Pain","Lipa"));
        mot.add(new Mot("Poulet","Soso"));
        mot.add(new Mot("Lait","Miliki"));
        mot.add(new Mot("Poisson Sale","Likayabu"));
        mot.add(new Mot("Colere","Kanda"));
        mot.add(new Mot("Joie","Esengo"));
        mot.add(new Mot("Tetu","Mutu makasi"));
        mot.add(new Mot("Sorcellerie","Kitshor"));
        mot.add(new Mot("Gourmandise","Kilokoso"));
        mot.add(new Mot("Provocation","Matumboli"));
        mot.add(new Mot("Mechant","Esprit mokabare"));
        mot.add(new Mot("Lumiere","Mwinda"));
        mot.add(new Mot("Joli","Kitoko"));
        mot.add(new Mot("Intelligence","Mayele"));
        mot.add(new Mot("Cacahouettes","Nguba"));
        mot.add(new Mot("Haricots","Madeblo"));
        mot.add(new Mot("Biere","Boki"));
        mot.add(new Mot("Boire","Ko bayer"));
        mot.add(new Mot("Bien se vetir","Ko beta forme"));
        mot.add(new Mot("Fiere","Lolendo"));
        mot.add(new Mot("Frere","Ndeko ya mobali"));
        mot.add(new Mot("Soeur","Ndeko ya mwasi"));
        mot.add(new Mot("Pere","Tata"));
        mot.add(new Mot("Mere","Mama"));
        mot.add(new Mot("Fetiche","Moto"));

        ListView maVue=(ListView)findViewById(R.id.maVue);
        MotAdapter word=new MotAdapter(MotListActivity.this,mot);
        maVue.setAdapter(word);
        maVue.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MotListActivity.this,""+mot.get(position),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
