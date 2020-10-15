
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
    "followonId",
    "followonNumber",
    "reasonCode",
    "reasonDescription",
    "links"
})
public class FollowOn {

    @JsonProperty("followonId")
    private String followonId;
    @JsonProperty("followonNumber")
    private String followonNumber;
    @JsonProperty("reasonCode")
    private String reasonCode;
    @JsonProperty("reasonDescription")
    private String reasonDescription;
    @JsonProperty("links")
    private List<Object> links = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("followonId")
    public String getFollowonId() {
        return followonId;
    }

    @JsonProperty("followonId")
    public void setFollowonId(String followonId) {
        this.followonId = followonId;
    }

    @JsonProperty("followonNumber")
    public String getFollowonNumber() {
        return followonNumber;
    }

    @JsonProperty("followonNumber")
    public void setFollowonNumber(String followonNumber) {
        this.followonNumber = followonNumber;
    }

    @JsonProperty("reasonCode")
    public String getReasonCode() {
        return reasonCode;
    }

    @JsonProperty("reasonCode")
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    @JsonProperty("reasonDescription")
    public String getReasonDescription() {
        return reasonDescription;
    }

    @JsonProperty("reasonDescription")
    public void setReasonDescription(String reasonDescription) {
        this.reasonDescription = reasonDescription;
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
