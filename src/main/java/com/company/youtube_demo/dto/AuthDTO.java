package com.company.youtube_demo.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Setter
@Getter
@ToString
public class AuthDTO {
    @NotNull(message = "Email Required !")
    @Email(message = "Email Not Valid !")
    private String email;
    @NotBlank(message = "Password required")
    @Size(min = 4, max = 15, message = "Password Not Valid")
    private String password;
}
