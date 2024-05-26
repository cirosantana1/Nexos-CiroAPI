package org.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CreateBookingDTO {

    @JsonProperty("firstname")
    private String firstname;

    @JsonProperty("lastname")
    private String lastname;

    @JsonProperty("totalprice")
    private int totalprice;

    @JsonProperty("depositpaid")
    private Boolean depositpaid;

    @JsonProperty("checkin")
    private String checkin;

    @JsonProperty("checkout")
    private String checkout;

    @JsonProperty("additionalneeds")
    private String additionalneeds;
}
