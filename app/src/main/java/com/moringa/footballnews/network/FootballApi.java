package com.moringa.footballnews.network;



import com.moringa.footballnews.models.Player;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FootballApi {
    //    @GET("trophies?player=276")
    @GET("trophies")
    Call<Player> playerTrophy(@Query("player") String id);
//    Call<Player> playerTrophy();
}
