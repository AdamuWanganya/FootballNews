
package com.moringa.footballnews.models.matches;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

//@Generated("jsonschema2pojo")
public class Response implements Serializable {

    @SerializedName("fixture")
    @Expose
    private Fixture fixture;
    @SerializedName("league")
    @Expose
    private League league;
    @SerializedName("teams")
    @Expose
    private Teams teams;
    @SerializedName("goals")
    @Expose
    private Goals goals;
    @SerializedName("score")
    @Expose
    private Score score;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Response() {
    }

    /**
     * 
     * @param fixture
     * @param score
     * @param teams
     * @param league
     * @param goals
     */
    public Response(Fixture fixture, League league, Teams teams, Goals goals, Score score) {
        super();
        this.fixture = fixture;
        this.league = league;
        this.teams = teams;
        this.goals = goals;
        this.score = score;
    }

    public Fixture getFixture() {
        return fixture;
    }

    public void setFixture(Fixture fixture) {
        this.fixture = fixture;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public Teams getTeams() {
        return teams;
    }

    public void setTeams(Teams teams) {
        this.teams = teams;
    }

    public Goals getGoals() {
        return goals;
    }

    public void setGoals(Goals goals) {
        this.goals = goals;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

}
