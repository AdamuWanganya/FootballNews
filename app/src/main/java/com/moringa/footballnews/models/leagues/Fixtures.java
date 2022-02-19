
package com.moringa.footballnews.models.leagues;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

//@Generated("jsonschema2pojo")
public class Fixtures implements Serializable {

    @SerializedName("events")
    @Expose
    private Boolean events;
    @SerializedName("lineups")
    @Expose
    private Boolean lineups;
    @SerializedName("statistics_fixtures")
    @Expose
    private Boolean statisticsFixtures;
    @SerializedName("statistics_players")
    @Expose
    private Boolean statisticsPlayers;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fixtures() {
    }

    /**
     * 
     * @param statisticsFixtures
     * @param events
     * @param lineups
     * @param statisticsPlayers
     */
    public Fixtures(Boolean events, Boolean lineups, Boolean statisticsFixtures, Boolean statisticsPlayers) {
        super();
        this.events = events;
        this.lineups = lineups;
        this.statisticsFixtures = statisticsFixtures;
        this.statisticsPlayers = statisticsPlayers;
    }

    public Boolean getEvents() {
        return events;
    }

    public void setEvents(Boolean events) {
        this.events = events;
    }

    public Boolean getLineups() {
        return lineups;
    }

    public void setLineups(Boolean lineups) {
        this.lineups = lineups;
    }

    public Boolean getStatisticsFixtures() {
        return statisticsFixtures;
    }

    public void setStatisticsFixtures(Boolean statisticsFixtures) {
        this.statisticsFixtures = statisticsFixtures;
    }

    public Boolean getStatisticsPlayers() {
        return statisticsPlayers;
    }

    public void setStatisticsPlayers(Boolean statisticsPlayers) {
        this.statisticsPlayers = statisticsPlayers;
    }

}
