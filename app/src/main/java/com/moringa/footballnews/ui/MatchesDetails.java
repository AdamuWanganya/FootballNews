package com.moringa.footballnews.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.moringa.footballnews.R;
import com.moringa.footballnews.models.matches.Response;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MatchesDetails extends AppCompatActivity {

    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;

    @BindView(R.id.homelogo2)  ImageView homeLogo;
    @BindView(R.id.home2) TextView homeName;
    @BindView(R.id.awaylogo2) ImageView awayLogo;
    @BindView(R.id.away2) TextView away;
    @BindView(R.id.leagueName2)  TextView leagueName;
    @BindView(R.id.leagueRound)  TextView leagueRound;
    @BindView(R.id.button) Button like;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matches_details);
        ButterKnife.bind(this);
        Response response = (Response) getIntent().getSerializableExtra("Match");

        Picasso.get().load(response.getTeams().getHome().getLogo()).into(homeLogo);
        homeName.setText(response.getTeams().getHome().getName());
        Picasso.get().load(response.getTeams().getAway().getLogo()).into(awayLogo);
        away.setText(response.getTeams().getAway().getName());
        leagueName.setText(response.getLeague().getName());
        leagueRound.setText(response.getLeague().getRound());

        //database
         FirebaseDatabase db = FirebaseDatabase.getInstance();
         DatabaseReference root = db.getReference().child("Leagues");


        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                root.push().setValue(response);
                Toast.makeText(MatchesDetails.this,"Saved",Toast.LENGTH_LONG).show();

            }
        });
    }



}