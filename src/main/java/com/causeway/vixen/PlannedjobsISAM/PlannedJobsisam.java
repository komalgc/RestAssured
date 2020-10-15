
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
    "masterClients",
    "links"
})
public class PlannedJobsisam {

    @JsonProperty("masterClients")
    private List<MasterClient> masterClients = null;
    @JsonProperty("links")
    private List<Link_> links = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("masterClients")
    public List<MasterClient> getMasterClients() {
        return masterClients;
    }

    @JsonProperty("masterClients")
    public void setMasterClients(List<MasterClient> masterClients) {
        this.masterClients = masterClients;
    }

    @JsonProperty("links")
    public List<Link_> getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(List<Link_> links) {
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
