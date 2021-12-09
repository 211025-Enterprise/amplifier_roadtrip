package com.revature.security.model;


import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
/**
 * The jwt return model that sends back a jwt string
 */
public class AuthenticationResponse {
    private String jwt;
}
