package com.example.lislis.mesexercices;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class AlertDialogueActivityBuiltIn extends AppCompatActivity {
    Button change,code;
    TextView monText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alert_dialogue_activity);
        change=(Button)findViewById(R.id.changer);
        code=(Button)findViewById(R.id.code);
        monText=(TextView)findViewById(R.id.text_change);

        final String[] noms={"Huguette","Theodore","Josee","Denise","Eric","Jackson","Christian","Sarah"};
        final String[] etonnement={"Ehhh!!!","Boni!!!","Tika nga kooo!!!","Tu me fais mal!!!","Arretes!!!","J'ai des rouges"};
        final Random rand=new Random();

      change.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              //Le builder par defaut
              AlertDialog.Builder builder=new AlertDialog.Builder(AlertDialogueActivityBuiltIn.this);
              builder.setTitle("Confirmation")
                      .setMessage("Voulez-vous vraiment changer de noms")
                      .setPositiveButton("Oui", new DialogInterface.OnClickListener() {
                          @Override
                          public void onClick(DialogInterface dialog, int which) {
                              int r=rand.nextInt(noms.length);
                              monText.setText(noms[r]);
                              change.setText("Changements...");
                          }
                      }).setNegativeButton("Non",null);
              AlertDialog alert=builder.create();
              alert.show();

          }
      });

        change.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int r=rand.nextInt(etonnement.length);
                change.setText(etonnement[r]);
                return true;
            }
        });
		
		
		//The custom Alert Dialog
        code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View vue=LayoutInflater.from(AlertDialogueActivityBuiltIn.this).inflate(R.layout.alert_dialogue_custom,null);
                final EditText codeTxt=(EditText)vue.findViewById(R.id.custom_alert);
                AlertDialog.Builder builder=new AlertDialog.Builder(AlertDialogueActivityBuiltIn.this);
                builder.setTitle("Authentification")
                        .setView(vue)
                        .setPositiveButton("Verifier", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                if(codeTxt.getText().toString().equals("12345678"))
                                {
                                    change.setText("changer");
                                    monText.setText("Changements");
                                }

                            }
                        }).setNegativeButton("Annuler",null).setCancelable(false);

                AlertDialog alert=builder.create();
                alert.show();


            }
        });

    }
}













