package com.company.youtube_demo.entity;

import com.company.youtube_demo.enums.ProfileStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Profile extends BaseEntity{
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surname;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;

    @Column(name = "updated_date")
    private LocalDateTime updatedDate = LocalDateTime.now();
    @Column
    private Boolean visible = true;

    @Column
    @Enumerated(EnumType.STRING)
    private ProfileStatus status;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "attach_id", nullable = true)
    private AttachEntity attach;

}
