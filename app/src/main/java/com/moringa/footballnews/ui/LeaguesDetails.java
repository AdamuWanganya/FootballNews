package com.moringa.footballnews.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.moringa.footballnews.R;
import com.moringa.footballnews.models.leagues.Response;
import com.squareup.picasso.Picasso;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LeaguesDetails extends AppCompatActivity {

    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;

//
//    private FirebaseDatabase db = FirebaseDatabase.getInstance();
//    private DatabaseReference root = db.getReference().child("Leagues");

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