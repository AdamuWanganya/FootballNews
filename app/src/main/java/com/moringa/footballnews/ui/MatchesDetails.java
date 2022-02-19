package com.moringa.footballnews.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.moringa.footballnews.R;
import com.moringa.footballnews.models.matches.Response;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MatchesDetails extends AppCompatActivity {
    @BindView(R.id.homelogo2)  ImageView homeLogo;
    @BindView(R.id.home2) TextView homeName;
    @BindView(R.id.awaylogo2) ImageView awayLogo;
    @BindView(R.id.away2) TextView away;
    @BindView(R.id.leagueName2)  TextView leagueName;
    @BindView(R.id.leagueRound)  TextView leagueRound;

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
    }

}