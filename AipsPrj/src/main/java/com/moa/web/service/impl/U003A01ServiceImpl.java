package com.moa.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.moa.web.dao.U003A01Dao;
import com.moa.web.service.U003A01Service;
import com.moa.web.vo.U003A01F1VO;

@Repository
public class U003A01ServiceImpl implements U003A01Service {

	@Autowired
	U003A01Dao u003A01Dao;

	@Override
	public int insertMtgrm(U003A01F1VO vo) {
		
		return u003A01Dao.insertMtgrm(vo);
	}

	@Override
	public List<U003A01F1VO> selectMtgrmList() {
		// TODO Auto-generated method stub
		return u003A01Dao.selectMtgrmList();
	}

	@Override
	public U003A01F1VO selectMtgrm(int id) {
		// TODO Auto-generated method stub
		return u003A01Dao.selectMtgrm(id);
	}

	@Override
	public int updateMtgrm(U003A01F1VO vo) {
		// TODO Auto-generated method stub
		return u003A01Dao.updateMtgrm(vo);
	}

}
