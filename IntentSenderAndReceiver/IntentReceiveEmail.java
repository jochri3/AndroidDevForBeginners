package com.example.lislis.premier;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class IntentReceiveEmail extends AppCompatActivity {

    TextView me_mail,from_mail,subject_mail,message_mail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_receive_email);
        me_mail=(TextView)findViewById(R.id.moi);
        from_mail=(TextView)findViewById(R.id.de);
        subject_mail=(TextView)findViewById(R.id.suj);
        message_mail=(TextView)findViewById(R.id.msg);

        Intent it=getIntent();
        me_mail.setText(it.getStringExtra("Destination"));
        from_mail.setText(it.getStringExtra("From"));
        subject_mail.setText(it.getStringExtra("Objet"));
        message_mail.setText(it.getStringExtra("Message"));
    }
}
