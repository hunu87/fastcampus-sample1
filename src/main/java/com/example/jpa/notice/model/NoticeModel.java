package com.example.jpa.notice.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter @Setter
public class NoticeModel {
	
	//ID, 제목, 내용, 등록일
	private int id;
	private String title;
	private String contents;
	private LocalDateTime regDate;
	
}
