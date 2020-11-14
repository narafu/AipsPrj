package com.moa.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.moa.web.service.U003A01Service;
import com.moa.web.vo.U003A01F1VO;

@Controller
@RequestMapping("/u003/")
public class U003A01 {

	@Autowired
	private U003A01Service u003A01Service;

	@GetMapping("A01L1")
	public String selectMtgrmList(ModelMap modelMap) {

		List<U003A01F1VO> u003A01List = u003A01Service.selectMtgrmList();

		modelMap.addAttribute("U003A01List", u003A01List);

		return "contents/u003/A01L1";
	}
	
	@GetMapping("{id}")
	public String selectMtgrm(@PathVariable(name = "id") int id, ModelMap modelMap) {

		U003A01F1VO vo = u003A01Service.selectMtgrm(id);

		modelMap.addAttribute("vo", vo);

		return "contents/u003/A01Q1";
	}

	@GetMapping("A01F1")
	public String insertMtgrm() {

		return "contents/u003/A01F1";
	}

	@PostMapping("A01F1")
	public String insertMtgrm(U003A01F1VO vo) {

		u003A01Service.insertMtgrm(vo);

		return "redirect:A01L1";
	}

	@GetMapping("A01U1")
	public String updateMtgrm(U003A01F1VO vo, ModelMap modelMap) {

		modelMap.addAttribute("vo", vo);
	
		return "contents/u003/A01U1";
	}
	
	@PostMapping("A01U1")
	public String updateMtgrm(U003A01F1VO vo) {

		u003A01Service.updateMtgrm(vo);
	
		return "redirect:A01L1";
	}

}
