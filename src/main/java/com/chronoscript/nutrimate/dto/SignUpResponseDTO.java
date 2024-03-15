package com.chronoscript.nutrimate.dto;

import lombok.Data;

@Data
public class SignUpResponseDTO {

    private Long id;
    private String email;
    private String token;
}
