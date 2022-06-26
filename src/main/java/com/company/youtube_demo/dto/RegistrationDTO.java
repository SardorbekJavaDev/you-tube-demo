package com.company.youtube_demo.dtos;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Setter
@Getter
public class RegistrationDTO {
    @NotBlank
    private String name;
    @NotBlank
    private String surname;
    @Email
    private String email;
    @NotBlank(message = "Password required")
    @Size(min = 4, max = 15, message = "About Me must be between 10 and 200 characters")
    private String password;
}
