package com.example.springboot3security6.auth;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String firstname;
    private  String lastname;
    private String email;
    private  String password;
}
