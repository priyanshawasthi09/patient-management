package com.pm.authservice.dto;

public class LoginResponseDTO {
    private final String token;

    public String getToken() {
        return token;
    }

    public LoginResponseDTO(String token) {
        this.token = token;
    }
}
