package com.company.youtube_demo.dto.videPlayListInfoDto;

import com.company.youtube_demo.dto.videoShortInfoDto.PreviewAttachDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class VidePlayListInfoDTO {
    private String id;
    private String title;
    private PreviewAttachDTO previewAttach;
    private LocalDateTime publishedDate;
    private Integer duration; // TODO: 18.05.2022 I have to added video duration !
}
