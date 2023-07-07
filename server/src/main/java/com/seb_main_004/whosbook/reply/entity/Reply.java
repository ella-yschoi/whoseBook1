package com.seb_main_004.whosbook.reply.entity;


import com.seb_main_004.whosbook.curation.entity.Curation;
import com.seb_main_004.whosbook.member.entity.Member;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long replyId;

    private String content;

    private LocalDateTime createdAt=LocalDateTime.now();

    private LocalDateTime updatedAt=LocalDateTime.now();
    @ManyToOne
    @JoinColumn(name = "curation_id")
    private Curation curation;

    //회원 맵핑 추가
    @ManyToOne
    @JoinColumn(name="member_id")
    private Member member;




}
