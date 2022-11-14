package com.tamtvh.be.message.request;

import com.tamtvh.be.email.ValidEmail;
import lombok.*;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class LoginRequest {

    @NotBlank(message = "email is required")
    @ValidEmail
    private String email;

    @NotBlank(message = "password is required")
    private String password;

    private String recaptchaResponse;
}
