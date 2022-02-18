
package com.moringa.footballnews.models.matches;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.moringa.footballnews.models.matches.Away;
import com.moringa.footballnews.models.matches.Home;

//@Generated("jsonschema2pojo")
public class Teams {

    @SerializedName("home")
    @Expose
    private Home home;
    @SerializedName("away")
    @Expose
    private Away away;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Teams() {
    }

    /**
     * 
     * @param away
     * @param home
     */
    public Teams(Home home, Away away) {
        super();
        this.home = home;
        this.away = away;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    public Away getAway() {
        return away;
    }

    public void setAway(Away away) {
        this.away = away;
    }

}
