
package com.moringa.footballnews.models.matches;

import java.io.Serializable;
import java.util.List;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class FootballFixtureResponse implements Serializable {

    @SerializedName("get")
    @Expose
    private String get;
    @SerializedName("errors")
    @Expose
    private List<Object> errors = null;
    @SerializedName("results")
    @Expose
    private Integer results;
    @SerializedName("paging")
    @Expose
    private Paging paging;
    @SerializedName("response")
    @Expose
    private List<Response> response = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FootballFixtureResponse() {
    }

    /**
     * 
     * @param response
     * @param get
     * @param paging
     * @param results
     * @param errors
     */
    public FootballFixtureResponse(String get, List<Object> errors, Integer results, Paging paging, List<Response> response) {
        super();
        this.get = get;
        this.errors = errors;
        this.results = results;
        this.paging = paging;
        this.response = response;
    }

    public String getGet() {
        return get;
    }

    public void setGet(String get) {
        this.get = get;
    }

    public List<Object> getErrors() {
        return errors;
    }

    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    public Integer getResults() {
        return results;
    }

    public void setResults(Integer results) {
        this.results = results;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    public List<Response> getResponse() {
        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }

}
