
package com.moringa.footballnews.models.leagues;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.moringa.footballnews.models.leagues.Fixtures;

//@Generated("jsonschema2pojo")
public class Coverage {

    @SerializedName("fixtures")
    @Expose
    private Fixtures fixtures;
    @SerializedName("standings")
    @Expose
    private Boolean standings;
    @SerializedName("players")
    @Expose
    private Boolean players;
    @SerializedName("top_scorers")
    @Expose
    private Boolean topScorers;
    @SerializedName("top_assists")
    @Expose
    private Boolean topAssists;
    @SerializedName("top_cards")
    @Expose
    private Boolean topCards;
    @SerializedName("injuries")
    @Expose
    private Boolean injuries;
    @SerializedName("predictions")
    @Expose
    private Boolean predictions;
    @SerializedName("odds")
    @Expose
    private Boolean odds;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Coverage() {
    }

    /**
     * 
     * @param topScorers
     * @param injuries
     * @param players
     * @param topCards
     * @param odds
     * @param topAssists
     * @param standings
     * @param predictions
     * @param fixtures
     */
    public Coverage(Fixtures fixtures, Boolean standings, Boolean players, Boolean topScorers, Boolean topAssists, Boolean topCards, Boolean injuries, Boolean predictions, Boolean odds) {
        super();
        this.fixtures = fixtures;
        this.standings = standings;
        this.players = players;
        this.topScorers = topScorers;
        this.topAssists = topAssists;
        this.topCards = topCards;
        this.injuries = injuries;
        this.predictions = predictions;
        this.odds = odds;
    }

    public Fixtures getFixtures() {
        return fixtures;
    }

    public void setFixtures(Fixtures fixtures) {
        this.fixtures = fixtures;
    }

    public Boolean getStandings() {
        return standings;
    }

    public void setStandings(Boolean standings) {
        this.standings = standings;
    }

    public Boolean getPlayers() {
        return players;
    }

    public void setPlayers(Boolean players) {
        this.players = players;
    }

    public Boolean getTopScorers() {
        return topScorers;
    }

    public void setTopScorers(Boolean topScorers) {
        this.topScorers = topScorers;
    }

    public Boolean getTopAssists() {
        return topAssists;
    }

    public void setTopAssists(Boolean topAssists) {
        this.topAssists = topAssists;
    }

    public Boolean getTopCards() {
        return topCards;
    }

    public void setTopCards(Boolean topCards) {
        this.topCards = topCards;
    }

    public Boolean getInjuries() {
        return injuries;
    }

    public void setInjuries(Boolean injuries) {
        this.injuries = injuries;
    }

    public Boolean getPredictions() {
        return predictions;
    }

    public void setPredictions(Boolean predictions) {
        this.predictions = predictions;
    }

    public Boolean getOdds() {
        return odds;
    }

    public void setOdds(Boolean odds) {
        this.odds = odds;
    }

}
