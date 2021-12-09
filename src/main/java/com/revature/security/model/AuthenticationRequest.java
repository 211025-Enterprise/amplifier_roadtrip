package com.revature.security.model;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
/**
 * this is just a model for authentication request to get a JWT. Used by /login
 */
public class AuthenticationRequest{

    private String username;
    private String password;
}
