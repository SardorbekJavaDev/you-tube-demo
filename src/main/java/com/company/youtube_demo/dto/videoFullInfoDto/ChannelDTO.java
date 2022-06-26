package com.company.youtube_demo.dto.videoShortInfoDto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ChannelDTO {
    private Integer id;
    private String name;
    private String photo; // url

    public ChannelDTO(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}


