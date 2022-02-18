
package com.moringa.footballnews.models.matches;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Extratime {

    @SerializedName("home")
    @Expose
    private Object home;
    @SerializedName("away")
    @Expose
    private Object away;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Extratime() {
    }

    /**
     * 
     * @param away
     * @param home
     */
    public Extratime(Object home, Object away) {
        super();
        this.home = home;
        this.away = away;
    }

    public Object getHome() {
        return home;
    }

    public void setHome(Object home) {
        this.home = home;
    }

    public Object getAway() {
        return away;
    }

    public void setAway(Object away) {
        this.away = away;
    }

}
