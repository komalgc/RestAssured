
package com.causeway.vixen.Plannedjobssql;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "siteId",
    "workScheduleList",
    "plants",
    "jobsPlanned",
    "links"
})
public class Site {

    @JsonProperty("siteId")
    private String siteId;
    @JsonProperty("workScheduleList")
    private List<Object> workScheduleList = null;
    @JsonProperty("plants")
    private List<Object> plants = null;
    @JsonProperty("jobsPlanned")
    private List<JobsPlanned> jobsPlanned = null;
    @JsonProperty("links")
    private List<Object> links = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("siteId")
    public String getSiteId() {
        return siteId;
    }

    @JsonProperty("siteId")
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    @JsonProperty("workScheduleList")
    public List<Object> getWorkScheduleList() {
        return workScheduleList;
    }

    @JsonProperty("workScheduleList")
    public void setWorkScheduleList(List<Object> workScheduleList) {
        this.workScheduleList = workScheduleList;
    }

    @JsonProperty("plants")
    public List<Object> getPlants() {
        return plants;
    }

    @JsonProperty("plants")
    public void setPlants(List<Object> plants) {
        this.plants = plants;
    }

    @JsonProperty("jobsPlanned")
    public List<JobsPlanned> getJobsPlanned() {
        return jobsPlanned;
    }

    @JsonProperty("jobsPlanned")
    public void setJobsPlanned(List<JobsPlanned> jobsPlanned) {
        this.jobsPlanned = jobsPlanned;
    }

    @JsonProperty("links")
    public List<Object> getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(List<Object> links) {
        this.links = links;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
