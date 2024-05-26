package org.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AuthDTO {

    @JsonProperty("username")
    private String username;

    @JsonProperty("password")
    private String password;
}
