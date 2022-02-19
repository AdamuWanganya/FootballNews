
package com.moringa.footballnews.models.matches;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

//
//@Generated("jsonschema2pojo")
public class Fulltime implements Serializable {

    @SerializedName("home")
    @Expose
    private Integer home;
    @SerializedName("away")
    @Expose
    private Integer away;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fulltime() {
    }

    /**
     * 
     * @param away
     * @param home
     */
    public Fulltime(Integer home, Integer away) {
        super();
        this.home = home;
        this.away = away;
    }

    public Integer getHome() {
        return home;
    }

    public void setHome(Integer home) {
        this.home = home;
    }

    public Integer getAway() {
        return away;
    }

    public void setAway(Integer away) {
        this.away = away;
    }

}
