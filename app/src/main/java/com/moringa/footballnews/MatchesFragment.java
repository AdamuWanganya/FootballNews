package com.moringa.footballnews;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.moringa.footballnews.models.Player;
import com.moringa.footballnews.models.matches.FootballFixtureResponse;
import com.moringa.footballnews.network.FootballApi;
import com.moringa.footballnews.network.FootballClient;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MatchesFragment extends Fragment {
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_matches, container, false);
        ButterKnife.bind(this, view);

        FootballApi footballApi = FootballClient.getClient();

        Call<FootballFixtureResponse> call1 =  footballApi.getMatches(1);
        call1.enqueue(new Callback<FootballFixtureResponse>() {
            @Override
            public void onResponse(Call<FootballFixtureResponse> call, Response<FootballFixtureResponse> response) {

                if (response.isSuccessful()){
                    Toast.makeText(getContext(), "Matches is success", Toast.LENGTH_SHORT).show();
                }

                else {
                    Toast.makeText(getContext(), "Matches not success", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<FootballFixtureResponse> call, Throwable t) {
                Toast.makeText(getContext(), "Matches Fail", Toast.LENGTH_SHORT).show();

            }
        });



        return view;
  }
}