
package com.moringa.footballnews.models.leagues;

import java.io.Serializable;
import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")e
public class FootballLeaguesResponse implements Serializable {

//    @SerializedName("get")
//    @Expose
//    private String get;
//    @SerializedName("parameters")
//    @Expose
//    private List<Object> parameters = null;
//    @SerializedName("errors")
//    @Expose
//    private List<Object> errors = null;
//    @SerializedName("results")
//    @Expose
//    private Long results;
    @SerializedName("response")
    @Expose
    private List<Response> response = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FootballLeaguesResponse() {
    }

    /**
     * 
     * @param response
     * @param get
     * @param parameters
     * @param results
     * @param errors
     */
    public FootballLeaguesResponse(String get, List<Object> parameters, List<Object> errors, Long results, List<Response> response) {
        super();
//        this.get = get;
//        this.parameters = parameters;
//        this.errors = errors;
//        this.results = results;
        this.response = response;
    }

//    public String getGet() {
//        return get;
//    }
//
//    public void setGet(String get) {
//        this.get = get;
//    }
//
//    public List<Object> getParameters() {
//        return parameters;
//    }
//
//    public void setParameters(List<Object> parameters) {
//        this.parameters = parameters;
//    }
//
//    public List<Object> getErrors() {
//        return errors;
//    }
//
//    public void setErrors(List<Object> errors) {
//        this.errors = errors;
//    }
//
//    public Long getResults() {
//        return results;
//    }
//
//    public void setResults(Long results) {
//        this.results = results;
//    }

    public List<Response> getResponse() {
        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }

}
