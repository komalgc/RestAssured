
package com.causeway.vixen.PlannedjobsISAM;

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
    "visitId",
    "taskId",
    "visitNumber",
    "visitDate",
    "earliestDate",
    "latestDate",
    "status",
    "orderNumber",
    "completed",
    "workType",
    "links"
})
public class JobsPlanned {

    @JsonProperty("visitId")
    private String visitId;
    @JsonProperty("taskId")
    private String taskId;
    @JsonProperty("visitNumber")
    private Integer visitNumber;
    @JsonProperty("visitDate")
    private String visitDate;
    @JsonProperty("earliestDate")
    private String earliestDate;
    @JsonProperty("latestDate")
    private String latestDate;
    @JsonProperty("status")
    private String status;
    @JsonProperty("orderNumber")
    private String orderNumber;
    @JsonProperty("completed")
    private Boolean completed;
    @JsonProperty("workType")
    private String workType;
    @JsonProperty("links")
    private List<Link> links = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("visitId")
    public String getVisitId() {
        return visitId;
    }

    @JsonProperty("visitId")
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    @JsonProperty("taskId")
    public String getTaskId() {
        return taskId;
    }

    @JsonProperty("taskId")
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @JsonProperty("visitNumber")
    public Integer getVisitNumber() {
        return visitNumber;
    }

    @JsonProperty("visitNumber")
    public void setVisitNumber(Integer visitNumber) {
        this.visitNumber = visitNumber;
    }

    @JsonProperty("visitDate")
    public String getVisitDate() {
        return visitDate;
    }

    @JsonProperty("visitDate")
    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    @JsonProperty("earliestDate")
    public String getEarliestDate() {
        return earliestDate;
    }

    @JsonProperty("earliestDate")
    public void setEarliestDate(String earliestDate) {
        this.earliestDate = earliestDate;
    }

    @JsonProperty("latestDate")
    public String getLatestDate() {
        return latestDate;
    }

    @JsonProperty("latestDate")
    public void setLatestDate(String latestDate) {
        this.latestDate = latestDate;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("orderNumber")
    public String getOrderNumber() {
        return orderNumber;
    }

    @JsonProperty("orderNumber")
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    @JsonProperty("completed")
    public Boolean getCompleted() {
        return completed;
    }

    @JsonProperty("completed")
    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    @JsonProperty("workType")
    public String getWorkType() {
        return workType;
    }

    @JsonProperty("workType")
    public void setWorkType(String workType) {
        this.workType = workType;
    }

    @JsonProperty("links")
    public List<Link> getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(List<Link> links) {
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
