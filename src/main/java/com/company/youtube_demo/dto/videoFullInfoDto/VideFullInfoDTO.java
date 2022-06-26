package com.company.youtube_demo.dto.videoFullInfoDto;

import com.company.youtube_demo.dto.TagDTO;
import com.company.youtube_demo.dto.videoShortInfoDto.ChannelDTO;
import com.company.youtube_demo.dto.videoShortInfoDto.PreviewAttachDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.time.LocalDateTime;

@Setter
@Getter
@ToString
public class VideFullInfoDTO {
    private String id;
    private String title;
    private String description;
    private PreviewAttachDTO previewAttach;
    private AttachDTO attach;
    private CategoryDTO category;
    private List<TagDTO> tagList;
    private LocalDateTime publishedDate;
    private ChannelDTO channel;
    private Integer viewCount;
    private Integer duration; // TODO: 18.05.2022 I have to added video duration !
    private Integer shareCount; // TODO: 18.05.2022 I have to added video duration !
    private LikeDTO like;
}
