package com.nitin.spring_data_jpa.auth.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class LoginResponse {
    private String token;
    private Long expiresIn;
    public String getToken(){
        return token;
    }
}
