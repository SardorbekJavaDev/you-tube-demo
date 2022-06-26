package com.company.youtube_demo.dto;

import com.company.youtube_demo.dto.playListInfoDto.PhotoDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentLikeInfoDTO {
        private String id;
        private String content;
        private Integer like;
        private Integer disLike;
        private LocalDateTime createdDate;
        private PhotoDTO photo;
}
