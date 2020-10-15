
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
    "masterClientId",
    "clients",
    "links"
})
public class MasterClient {

    @JsonProperty("masterClientId")
    private String masterClientId;
    @JsonProperty("clients")
    private List<Client> clients = null;
    @JsonProperty("links")
    private List<Object> links = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("masterClientId")
    public String getMasterClientId() {
        return masterClientId;
    }

    @JsonProperty("masterClientId")
    public void setMasterClientId(String masterClientId) {
        this.masterClientId = masterClientId;
    }

    @JsonProperty("clients")
    public List<Client> getClients() {
        return clients;
    }

    @JsonProperty("clients")
    public void setClients(List<Client> clients) {
        this.clients = clients;
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
