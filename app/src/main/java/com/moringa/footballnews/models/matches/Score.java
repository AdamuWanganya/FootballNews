
package com.moringa.footballnews.models.matches;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.moringa.footballnews.models.matches.Extratime;
import com.moringa.footballnews.models.matches.Fulltime;
import com.moringa.footballnews.models.matches.Halftime;
import com.moringa.footballnews.models.matches.Penalty;

import java.io.Serializable;

//@Generated("jsonschema2pojo")
public class Score implements Serializable {

    @SerializedName("halftime")
    @Expose
    private Halftime halftime;
    @SerializedName("fulltime")
    @Expose
    private Fulltime fulltime;
    @SerializedName("extratime")
    @Expose
    private Extratime extratime;
    @SerializedName("penalty")
    @Expose
    private Penalty penalty;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Score() {
    }

    /**
     * 
     * @param halftime
     * @param penalty
     * @param fulltime
     * @param extratime
     */
    public Score(Halftime halftime, Fulltime fulltime, Extratime extratime, Penalty penalty) {
        super();
        this.halftime = halftime;
        this.fulltime = fulltime;
        this.extratime = extratime;
        this.penalty = penalty;
    }

    public Halftime getHalftime() {
        return halftime;
    }

    public void setHalftime(Halftime halftime) {
        this.halftime = halftime;
    }

    public Fulltime getFulltime() {
        return fulltime;
    }

    public void setFulltime(Fulltime fulltime) {
        this.fulltime = fulltime;
    }

    public Extratime getExtratime() {
        return extratime;
    }

    public void setExtratime(Extratime extratime) {
        this.extratime = extratime;
    }

    public Penalty getPenalty() {
        return penalty;
    }

    public void setPenalty(Penalty penalty) {
        this.penalty = penalty;
    }

}
