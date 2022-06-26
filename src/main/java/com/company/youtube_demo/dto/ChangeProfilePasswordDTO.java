package com.company.youtube_demo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChangePasswordDTO {
    private String oldPassword;
    private String newPassword;
}
