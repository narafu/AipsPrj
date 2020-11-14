package com.moa.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.moa.web.vo.U003A01F1VO;

@Service
public interface U003A01Service {
	
	public int insertMtgrm(U003A01F1VO vo);

	public List<U003A01F1VO> selectMtgrmList();

	public U003A01F1VO selectMtgrm(int id);

	public int updateMtgrm(U003A01F1VO vo);

}
