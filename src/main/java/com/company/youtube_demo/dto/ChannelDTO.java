package com.company.youtube_demo.dtos;

import com.company.youtube_demo.enums.ChannelStatus;
import com.company.youtube_demo.enums.ChannelType;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;

public class ChannelDTO {
    private String name;
    private String description;
    private String key;
    private ChannelType type;
    private LocalDateTime createdDate;
}
