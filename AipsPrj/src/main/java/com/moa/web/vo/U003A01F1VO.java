package com.moa.web.vo;

import java.util.Date;

import lombok.Data;

@Data
public class U003A01F1VO {

//	인덱스
	private int id;
//	등록시간
	private Date regdate;
//	회의실명
	public String mtgNm;
//	연락처
	public String cttpc;
//	담당자
	private String charger;
//	부담당자
	private String shfcr;
//	운영상태
	private String operSttus;
//	운영시간-시
	private String operSttusHourSt;
//	운영시간-분
	private String operSttusMinSt;
//	운영시간-시
	private String operSttusHourEd;
//	운영시간-분
	private String operSttusMinEd;
//	사유
	private String prvonsh;
//	예약시간-시
	private String resveTimeHourSt;
//	예약시간-분
	private String resveTimeMinSt;
//	예약시간-시
	private String resveTimeHourEd;
//	예약시간-분
	private String resveTimeMinEd;
//	저녁예약여부
	private char isDinnrResve;
//	공휴일예약여부
	private char isHldyResve;
//	장소
	private int place;
//	책상 수
	private int deskCo;
//	의자 수
	private int chairCo;
//	마이크 수
	private int micCo;
//	프로젝트 보유
	private char isPrjctHold;
//	랜 갯수
	private int lanCo;
//	현수막크기 -가로
	private int bannerW;
//	현수막크기 -세로
	private int bannerH;
//	면적
	private int area;
//	수용인원
	private int aceptncNmpr;
//	용도 및 이용시설
	private String prpos;
//	주지사항
	private String atpn;

}
