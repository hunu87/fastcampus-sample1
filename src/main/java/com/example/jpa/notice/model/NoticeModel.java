package com.example.jpa.notice.model;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class NoticeModel {
	
	//ID, 제목, 내용, 등록일
	private int id;
	private String title;
	private String contents;
	private LocalDateTime regDate;
	
}
