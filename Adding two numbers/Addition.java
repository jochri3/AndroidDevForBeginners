package com.example.lislis.premier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Addition extends AppCompatActivity {

    Button plus,moins,divise,multipl;
    EditText n1,n2;
    TextView reponse;
    float nb1,nb2,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);

        plus=(Button)findViewById(R.id.addition);
        moins=(Button)findViewById(R.id.soustraction);
        divise=(Button)findViewById(R.id.division);
        multipl=(Button)findViewById(R.id.multiplication);
        n1=(EditText) findViewById(R.id.nb1);
        n2=(EditText) findViewById(R.id.nb2);
        reponse=(TextView) findViewById(R.id.reponse);


        //Addition

        plus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               assignation();
                res=nb1+nb2;
                reponse.setText(""+res);
            }
        });

        moins.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                assignation();
                res=nb1-nb2;
                reponse.setText(""+res);
            }
        });

        multipl.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                assignation();
                res=nb1*nb2;
                reponse.setText(""+res);
            }
        });

        divise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                assignation();
                try {
                    res=nb1/nb2;
                    reponse.setText(""+res);
                }
                catch (IllegalArgumentException e)
                {
                    e.printStackTrace();
                    Toast.makeText(Addition.this, "Impossible de faire une division par 0", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void assignation()
    {
        try
        {
            nb1=Float.parseFloat(n1.getText().toString());
            nb2=Float.parseFloat(n2.getText().toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
