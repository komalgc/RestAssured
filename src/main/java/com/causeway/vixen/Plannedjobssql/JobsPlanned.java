
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
    "visitId",
    "taskId",
    "visitNumber",
    "visitDate",
    "status",
    "engineer",
    "completed",
    "followOns",
    "workSchedules",
    "invoiced",
    "workType",
    "workItems",
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
    @JsonProperty("status")
    private String status;
    @JsonProperty("engineer")
    private String engineer;
    @JsonProperty("completed")
    private Boolean completed;
    @JsonProperty("followOns")
    private List<FollowOn> followOns = null;
    @JsonProperty("workSchedules")
    private List<WorkSchedule> workSchedules = null;
    @JsonProperty("invoiced")
    private Boolean invoiced;
    @JsonProperty("workType")
    private String workType;
    @JsonProperty("workItems")
    private List<WorkItem> workItems = null;
    @JsonProperty("links")
    private List<Object> links = null;
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

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("engineer")
    public String getEngineer() {
        return engineer;
    }

    @JsonProperty("engineer")
    public void setEngineer(String engineer) {
        this.engineer = engineer;
    }

    @JsonProperty("completed")
    public Boolean getCompleted() {
        return completed;
    }

    @JsonProperty("completed")
    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    @JsonProperty("followOns")
    public List<FollowOn> getFollowOns() {
        return followOns;
    }

    @JsonProperty("followOns")
    public void setFollowOns(List<FollowOn> followOns) {
        this.followOns = followOns;
    }

    @JsonProperty("workSchedules")
    public List<WorkSchedule> getWorkSchedules() {
        return workSchedules;
    }

    @JsonProperty("workSchedules")
    public void setWorkSchedules(List<WorkSchedule> workSchedules) {
        this.workSchedules = workSchedules;
    }

    @JsonProperty("invoiced")
    public Boolean getInvoiced() {
        return invoiced;
    }

    @JsonProperty("invoiced")
    public void setInvoiced(Boolean invoiced) {
        this.invoiced = invoiced;
    }

    @JsonProperty("workType")
    public String getWorkType() {
        return workType;
    }

    @JsonProperty("workType")
    public void setWorkType(String workType) {
        this.workType = workType;
    }

    @JsonProperty("workItems")
    public List<WorkItem> getWorkItems() {
        return workItems;
    }

    @JsonProperty("workItems")
    public void setWorkItems(List<WorkItem> workItems) {
        this.workItems = workItems;
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
