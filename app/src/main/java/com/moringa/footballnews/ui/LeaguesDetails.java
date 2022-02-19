package com.moringa.footballnews.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.moringa.footballnews.R;
import com.moringa.footballnews.models.leagues.Response;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LeaguesDetails extends AppCompatActivity {
    @BindView(R.id.homelogo2)  ImageView countryLogo;
    @BindView(R.id.home2) TextView countryName;
    @BindView(R.id.awaylogo2) ImageView leagueLogo;
    @BindView(R.id.away2) TextView leagueName;
    @BindView(R.id.leagueName2)  TextView leagueType;
    @BindView(R.id.leagueRound)  TextView leagueRound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leagues_details);
        ButterKnife.bind(this);

        Response response = (Response) getIntent().getSerializableExtra("Details");

        Picasso.get().load(response.getCountry().getFlag()).into(countryLogo);
        countryName.setText(response.getCountry().getName());
        Picasso.get().load(response.getLeague().getLogo()).into(leagueLogo);
        leagueName.setText(response.getLeague().getType());
        leagueRound.setText(response.getLeague().getType());

    }
}