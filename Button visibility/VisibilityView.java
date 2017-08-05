package com.example.lislis.premier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VisibilityView extends AppCompatActivity {
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visibility_view);
        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.btn2);
        b3=(Button)findViewById(R.id.btn3);


        //Une des methode pour definir les listener
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setVisibility(View.GONE);
//                b1.setVisibility(View.INVISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
            }
        });
    }

    public void clickBtn2(View v)
    {
        b2.setVisibility(View.GONE);
        b1.setVisibility(View.VISIBLE);
        b3.setVisibility(View.VISIBLE);
    }

    public void clickBtn3(View v)
    {
        b3.setVisibility(View.GONE);
        b2.setVisibility(View.VISIBLE);
        b1.setVisibility(View.VISIBLE);
    }

}
