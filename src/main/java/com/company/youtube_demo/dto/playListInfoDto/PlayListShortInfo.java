package com.company.youtube_demo.dto.playListShortInfo;

import com.company.youtube_demo.dto.playListInfoDto.ChannelDTO;
import com.company.youtube_demo.dto.playListInfoDto.ProfileDTO;
import com.company.youtube_demo.dto.playListInfoDto.StatusDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlayListShortInfo {
    private Integer id;
    private String name;
    private Integer videoCount;
    private LocalDateTime createdDate;
    private ChannelDTO channel;
    private java.util.List<VideoDTO> list;
//    id, name,created_date,channel(id,name),video_count,video_list[{id,name,key,duration}] (first 2)
}
