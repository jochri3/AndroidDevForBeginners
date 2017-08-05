package com.example.lislis.premier;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentSendEmail extends AppCompatActivity {

    EditText org,dest,object,contenu;
    Button envoyer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email_interface);
        org=(EditText)findViewById(R.id.from);
        dest=(EditText)findViewById(R.id.to);
        object=(EditText)findViewById(R.id.subject);
        contenu=(EditText)findViewById(R.id.content);

        envoyer=(Button)findViewById(R.id.send);

        envoyer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                String origine=org.getText().toString();
                String destination=dest.getText().toString();
                String objet=object.getText().toString();
                String message=contenu.getText().toString();
                Intent i=new Intent(IntentSendEmail.this,IntentReceiveEmail.class);
                i.putExtra("From",origine);
                i.putExtra("Destination",destination);
                i.putExtra("Objet",objet);
                i.putExtra("Message",message);
                startActivity(i);

            }
        });

    }
}
