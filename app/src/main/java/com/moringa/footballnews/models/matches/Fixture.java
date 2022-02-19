
package com.moringa.footballnews.models.matches;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

//@Generated("jsonschema2pojo")
public class Fixture implements Serializable {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("referee")
    @Expose
    private String referee;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("timestamp")
    @Expose
    private Integer timestamp;
    @SerializedName("periods")
    @Expose
    private Periods periods;
    @SerializedName("venue")
    @Expose
    private Venue venue;
    @SerializedName("status")
    @Expose
    private Status status;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fixture() {
    }

    /**
     * 
     * @param date
     * @param venue
     * @param timezone
     * @param periods
     * @param id
     * @param referee
     * @param timestamp
     * @param status
     */
    public Fixture(Integer id, String referee, String timezone, String date, Integer timestamp, Periods periods, Venue venue, Status status) {
        super();
        this.id = id;
        this.referee = referee;
        this.timezone = timezone;
        this.date = date;
        this.timestamp = timestamp;
        this.periods = periods;
        this.venue = venue;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public Periods getPeriods() {
        return periods;
    }

    public void setPeriods(Periods periods) {
        this.periods = periods;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
