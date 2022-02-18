
package com.moringa.footballnews.models.leagues;

import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Response {

    @SerializedName("league")
    @Expose
    private League league;
    @SerializedName("country")
    @Expose
    private Country country;
    @SerializedName("seasons")
    @Expose
    private List<Season> seasons = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Response() {
    }

    /**
     * 
     * @param country
     * @param seasons
     * @param league
     */
    public Response(League league, Country country, List<Season> seasons) {
        super();
        this.league = league;
        this.country = country;
        this.seasons = seasons;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<Season> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<Season> seasons) {
        this.seasons = seasons;
    }

}
