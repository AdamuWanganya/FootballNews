package com.moringa.footballnews.network;

import com.moringa.footballnews.models.Player;
import com.moringa.footballnews.models.leagues.FootballLeaguesResponse;
import com.moringa.footballnews.models.matches.FootballFixtureResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FootballApi {
    @GET("leagues")
    Call<FootballLeaguesResponse> getLeagues(
            @Query("last") int last
    );

    @GET("fixtures")
    Call<FootballFixtureResponse> getMatches(@Query("last") int id);
   // Todo hit fixtures end point
}
