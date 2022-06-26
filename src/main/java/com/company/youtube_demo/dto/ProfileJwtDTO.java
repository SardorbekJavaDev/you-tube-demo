package com.company.youtube_demo.dtos;

import com.company.youtube_demo.enums.ProfileRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProfileJwtDTO {
    private Integer id;
    private ProfileRole role;
}
