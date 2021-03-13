package com.example.jpa.notice.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.jpa.notice.model.NoticeModel;

@RestController
public class ApiNoticeController {
	
	/*
	@GetMapping("/api/notice")
	public String noticeString() {
		return "공지사항입니다.";
	}
	*/
	
	@GetMapping("/api/notice")
	public NoticeModel notice() {
		
		LocalDateTime regDate = LocalDateTime.of(2021, 2, 8, 0, 0);
		
		NoticeModel noticeModel = new NoticeModel();
		noticeModel.setId(1);
		noticeModel.setTitle("공지사항입니다.");
		noticeModel.setContents("공지사항 내용입니다.");
		noticeModel.setRegDate(regDate);
		
		return noticeModel;
	}
}
