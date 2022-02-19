
package com.moringa.footballnews.models.matches;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

//@Generated("jsonschema2pojo")
public class Periods implements Serializable {

    @SerializedName("first")
    @Expose
    private Integer first;
    @SerializedName("second")
    @Expose
    private Integer second;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Periods() {
    }

    /**
     * 
     * @param first
     * @param second
     */
    public Periods(Integer first, Integer second) {
        super();
        this.first = first;
        this.second = second;
    }

    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

}
