package com.bezets.cityappar.models.elevation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Elevation {

@SerializedName("results")
@Expose
private List<Result> results = null;
@SerializedName("status")
@Expose
private String status;

public List<Result> getResults() {
return results;
}

public void setResults(List<Result> results) {
this.results = results;
}

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}

}

