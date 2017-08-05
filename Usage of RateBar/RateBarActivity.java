package com.example.lislis.mesexercices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class RateBarActivity extends AppCompatActivity {
RatingBar rate;
TextView votes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rate_bar_activity);
        rate=(RatingBar)findViewById(R.id.rate);
        votes=(TextView)findViewById(R.id.votes);


        rate.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                votes.setText(""+rate.getRating());
                Toast.makeText(RateBarActivity.this,"Vous avez "+rate.getRating()+" votes",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
