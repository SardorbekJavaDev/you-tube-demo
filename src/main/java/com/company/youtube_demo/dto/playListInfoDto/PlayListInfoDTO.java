package com.company.youtube_demo.dto.playListInfoDto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlayListInfoDTO {
    private Integer id;
    private String name;
    private String description;
    private Integer orderNumber;
    private ChannelDTO channel;
    private ProfileDTO profile;
    private StatusDTO status;
}
