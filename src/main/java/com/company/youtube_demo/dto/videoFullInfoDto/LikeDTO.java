package com.company.youtube_demo.dto.videoFullInfoDto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LikeDTO {
    private Integer likeCount;
    private Integer disLikeCount;
    private Boolean isUserLiked;
    private Boolean IsUserDisliked;
}
