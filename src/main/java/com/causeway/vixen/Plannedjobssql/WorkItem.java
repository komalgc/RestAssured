
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
    "visiDate",
    "visit",
    "engineer",
    "workItemsRef",
    "plantRef",
    "ppmCode",
    "itemType",
    "tradeCode",
    "sequenceCode",
    "plannedDate",
    "earlyDate",
    "lateDate",
    "diaryDate",
    "engineerCurrent",
    "status",
    "meterReading",
    "ppmCatagory",
    "ppmType",
    "links",
    "engineerCompleted",
    "comments"
})
public class WorkItem {

    @JsonProperty("visiDate")
    private String visiDate;
    @JsonProperty("visit")
    private Integer visit;
    @JsonProperty("engineer")
    private String engineer;
    @JsonProperty("workItemsRef")
    private String workItemsRef;
    @JsonProperty("plantRef")
    private String plantRef;
    @JsonProperty("ppmCode")
    private String ppmCode;
    @JsonProperty("itemType")
    private String itemType;
    @JsonProperty("tradeCode")
    private String tradeCode;
    @JsonProperty("sequenceCode")
    private String sequenceCode;
    @JsonProperty("plannedDate")
    private String plannedDate;
    @JsonProperty("earlyDate")
    private String earlyDate;
    @JsonProperty("lateDate")
    private String lateDate;
    @JsonProperty("diaryDate")
    private String diaryDate;
    @JsonProperty("engineerCurrent")
    private String engineerCurrent;
    @JsonProperty("status")
    private String status;
    @JsonProperty("meterReading")
    private String meterReading;
    @JsonProperty("ppmCatagory")
    private String ppmCatagory;
    @JsonProperty("ppmType")
    private String ppmType;
    @JsonProperty("links")
    private List<Object> links = null;
    @JsonProperty("engineerCompleted")
    private String engineerCompleted;
    @JsonProperty("comments")
    private String comments;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("visiDate")
    public String getVisiDate() {
        return visiDate;
    }

    @JsonProperty("visiDate")
    public void setVisiDate(String visiDate) {
        this.visiDate = visiDate;
    }

    @JsonProperty("visit")
    public Integer getVisit() {
        return visit;
    }

    @JsonProperty("visit")
    public void setVisit(Integer visit) {
        this.visit = visit;
    }

    @JsonProperty("engineer")
    public String getEngineer() {
        return engineer;
    }

    @JsonProperty("engineer")
    public void setEngineer(String engineer) {
        this.engineer = engineer;
    }

    @JsonProperty("workItemsRef")
    public String getWorkItemsRef() {
        return workItemsRef;
    }

    @JsonProperty("workItemsRef")
    public void setWorkItemsRef(String workItemsRef) {
        this.workItemsRef = workItemsRef;
    }

    @JsonProperty("plantRef")
    public String getPlantRef() {
        return plantRef;
    }

    @JsonProperty("plantRef")
    public void setPlantRef(String plantRef) {
        this.plantRef = plantRef;
    }

    @JsonProperty("ppmCode")
    public String getPpmCode() {
        return ppmCode;
    }

    @JsonProperty("ppmCode")
    public void setPpmCode(String ppmCode) {
        this.ppmCode = ppmCode;
    }

    @JsonProperty("itemType")
    public String getItemType() {
        return itemType;
    }

    @JsonProperty("itemType")
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @JsonProperty("tradeCode")
    public String getTradeCode() {
        return tradeCode;
    }

    @JsonProperty("tradeCode")
    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
    }

    @JsonProperty("sequenceCode")
    public String getSequenceCode() {
        return sequenceCode;
    }

    @JsonProperty("sequenceCode")
    public void setSequenceCode(String sequenceCode) {
        this.sequenceCode = sequenceCode;
    }

    @JsonProperty("plannedDate")
    public String getPlannedDate() {
        return plannedDate;
    }

    @JsonProperty("plannedDate")
    public void setPlannedDate(String plannedDate) {
        this.plannedDate = plannedDate;
    }

    @JsonProperty("earlyDate")
    public String getEarlyDate() {
        return earlyDate;
    }

    @JsonProperty("earlyDate")
    public void setEarlyDate(String earlyDate) {
        this.earlyDate = earlyDate;
    }

    @JsonProperty("lateDate")
    public String getLateDate() {
        return lateDate;
    }

    @JsonProperty("lateDate")
    public void setLateDate(String lateDate) {
        this.lateDate = lateDate;
    }

    @JsonProperty("diaryDate")
    public String getDiaryDate() {
        return diaryDate;
    }

    @JsonProperty("diaryDate")
    public void setDiaryDate(String diaryDate) {
        this.diaryDate = diaryDate;
    }

    @JsonProperty("engineerCurrent")
    public String getEngineerCurrent() {
        return engineerCurrent;
    }

    @JsonProperty("engineerCurrent")
    public void setEngineerCurrent(String engineerCurrent) {
        this.engineerCurrent = engineerCurrent;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("meterReading")
    public String getMeterReading() {
        return meterReading;
    }

    @JsonProperty("meterReading")
    public void setMeterReading(String meterReading) {
        this.meterReading = meterReading;
    }

    @JsonProperty("ppmCatagory")
    public String getPpmCatagory() {
        return ppmCatagory;
    }

    @JsonProperty("ppmCatagory")
    public void setPpmCatagory(String ppmCatagory) {
        this.ppmCatagory = ppmCatagory;
    }

    @JsonProperty("ppmType")
    public String getPpmType() {
        return ppmType;
    }

    @JsonProperty("ppmType")
    public void setPpmType(String ppmType) {
        this.ppmType = ppmType;
    }

    @JsonProperty("links")
    public List<Object> getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(List<Object> links) {
        this.links = links;
    }

    @JsonProperty("engineerCompleted")
    public String getEngineerCompleted() {
        return engineerCompleted;
    }

    @JsonProperty("engineerCompleted")
    public void setEngineerCompleted(String engineerCompleted) {
        this.engineerCompleted = engineerCompleted;
    }

    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
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
