package com.moringa.footballnews;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.moringa.footballnews.adapters.LeaguesRecylerViewAdapter;
import com.moringa.footballnews.models.Player;
import com.moringa.footballnews.models.leagues.FootballLeaguesResponse;
import com.moringa.footballnews.network.FootballApi;
import com.moringa.footballnews.network.FootballClient;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class LeaguesFragment extends Fragment {


    FootballClient leaguesClient;

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_leagues, container, false);
        ButterKnife.bind(this, view);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        // Inflate the layout for this fragment
        FootballApi footballApi = FootballClient.getClient();
        Call<FootballLeaguesResponse> call =  footballApi.getLeagues(10);

        call.enqueue(new Callback<FootballLeaguesResponse>() {
            @Override
            public void onResponse(Call<FootballLeaguesResponse> call, Response<FootballLeaguesResponse> response) {
                if (response.isSuccessful()){

                    List<com.moringa.footballnews.models.leagues.Response> responseList =  response.body().getResponse();

                    recyclerView.setAdapter(new LeaguesRecylerViewAdapter(getContext(),responseList));

                    Toast.makeText(getContext(),"Leagues successful",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getContext(),"Leagues Notsuccessful",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<FootballLeaguesResponse> call, Throwable t) {
//                Log.e("error",call.request().);

            }
        });


        return view;
    }
}

