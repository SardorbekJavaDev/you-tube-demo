package com.company.youtube_demo.dtos;

import com.company.youtube_demo.enums.EmailType;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class EmailDTO {
    private Integer id;
    private String toEmail;
    private EmailType type;
    private LocalDateTime sendDate = LocalDateTime.now();
}
