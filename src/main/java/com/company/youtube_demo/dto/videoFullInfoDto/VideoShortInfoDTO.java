package com.company.youtube_demo.dto.videoShortInfoDto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
@Setter
@Getter
@ToString
public class VideoShortInfoDTO {
    private String id;
    private String title;
    private LocalDateTime publishedDate;
    private Integer viewCount;
    private Integer duration; // TODO: 18.05.2022 I have to added video duration !

    private PreviewAttachDTO previewAttach;
    private ChannelDTO channel;
}
