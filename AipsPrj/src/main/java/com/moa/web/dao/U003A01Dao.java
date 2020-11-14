package com.moa.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.moa.web.vo.U003A01F1VO;

@Mapper
public interface U003A01Dao {

	@Insert("INSERT INTO U003A01F1VO VALUES #{vo}")
	public int insertMtgrm(U003A01F1VO vo);

	@Select("SELECT * FROM U003A01F1VO ORDER BY REGDATE DESC")
	public List<U003A01F1VO> selectMtgrmList();

	@Select("SELECT * FROM U003A01F1VO WHERE ID = #{id}")
	public U003A01F1VO selectMtgrm(int id);

	@Update("")
	public int updateMtgrm(U003A01F1VO vo);

}
