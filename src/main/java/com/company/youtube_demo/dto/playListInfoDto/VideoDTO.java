package com.company.youtube_demo.dto.playListShortInfo;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class VideoDTO {
    private String id;
    private String name;
    private Double duration;
}
