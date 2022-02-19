
package com.moringa.footballnews.models.matches;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

//@Generated("jsonschema2pojo")
public class Paging implements Serializable {

    @SerializedName("current")
    @Expose
    private Integer current;
    @SerializedName("total")
    @Expose
    private Integer total;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Paging() {
    }

    /**
     * 
     * @param current
     * @param total
     */
    public Paging(Integer current, Integer total) {
        super();
        this.current = current;
        this.total = total;
    }

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

}
