package com.example.lislis.mesexercices;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonCheckBoxActivity extends AppCompatActivity {
RadioGroup rg;
RadioButton m,f;
CheckBox java,python;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio_button_activity);
        rg=(RadioGroup)findViewById(R.id.radio_parent);
        m=(RadioButton)findViewById(R.id.m);
        f=(RadioButton)findViewById(R.id.f);
        java=(CheckBox)findViewById(R.id.java);
        python=(CheckBox)findViewById(R.id.python);

        //Action du radio
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if(m.isChecked())
                {
                    Toast.makeText(getBaseContext(),"Vous etes un homme",Toast.LENGTH_SHORT).show();
                }
                else if(f.isChecked())
                {
                    Toast.makeText(getBaseContext(),"Vous etets une femme",Toast.LENGTH_SHORT).show();
                }
            }
        });

        java.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(getBaseContext(),"Java",Toast.LENGTH_SHORT).show();
            }
        });

        python.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(getBaseContext(),"Python",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
