package fi.solita.piifaker.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AddressRecord(@JsonProperty("streetAddress")String streetAddress,
                            @JsonProperty("city")String city,
                            @JsonProperty("zipCode")String zipCode,
                            @JsonProperty("country")String country) {
}

