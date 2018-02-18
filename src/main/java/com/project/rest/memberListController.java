package com.project.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.rest.memberVO;

@RestController
public class memberListController {
	
	@Autowired
	private testMapper testMapper;
	
	@RequestMapping("/member")
	public List<memberVO> member() throws Exception {
		List<memberVO> member = testMapper.memberList();
		//int count = testMapper.memberList();
		return member;
	}

}
