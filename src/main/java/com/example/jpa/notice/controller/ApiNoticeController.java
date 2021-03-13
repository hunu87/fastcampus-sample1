package com.example.jpa.notice.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
	
	/*
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
	*/
	
	@GetMapping("/api/notice")
	public List<NoticeModel> notice() {
		
		List<NoticeModel> notiList = new ArrayList<>();
		
		notiList.add(NoticeModel.builder()
				.id(1)
				.title("공지사항입니다.")
				.contents("공지사항 내용입니다.")
				.regDate(LocalDateTime.of(2021, 1, 30, 0, 0))
				.build());
		
		notiList.add(NoticeModel.builder()
				.id(2)
				.title("두번째 공지사항입니다.")
				.contents("두번째 공지사항 내용입니다.")
				.regDate(LocalDateTime.of(2021, 1, 31, 0, 0))
				.build());
		
		return notiList;
	}
}
