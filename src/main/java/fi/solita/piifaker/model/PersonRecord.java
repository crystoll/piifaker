package fi.solita.piifaker.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public record PersonRecord(@JsonProperty("sex")Sex sex,
                           @JsonProperty("firstName")String firstName,
                           @JsonProperty("lastName")String lastName,
                           @JsonProperty("emailAddress")String emailAddress,
                           @JsonProperty("dateOfBirth")LocalDate dateOfBirth,
                           @JsonProperty("socialSecurityNumber")String socialSecurityNumber,
                           @JsonProperty("address")AddressRecord address) {}
