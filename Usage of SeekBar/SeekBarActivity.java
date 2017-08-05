package com.example.lislis.mesexercices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class SeekBarActivity extends AppCompatActivity {
TextView grow,progres;
SeekBar seek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seek_bar_activity);
        grow=(TextView)findViewById(R.id.grandir);
        progres=(TextView)findViewById(R.id.progression);
        seek=(SeekBar)findViewById(R.id.seek);


        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            //Quand on est entrain de faire progresser la bar
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                grow.setTextSize(progress);
                progres.setText(progress+"px");
            }

            //Juste au debut de la progression

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getBaseContext(),"Ebandi ehhhhhh!!!",Toast.LENGTH_SHORT).show();

            }

            //Quand on arrete de faire progresser la barre

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getBaseContext(),"Ekatii ehhhhhh!!!!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
