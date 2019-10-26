package com.kang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kang.bean.Choice;
import com.kang.result.ResultBean;
import com.kang.service.ChoiceService;

@RestController
@RequestMapping("/choice")
public class ChoiceController {
	
	@Autowired
	private ChoiceService choiceService;

	@PostMapping("/create")
	public ResultBean create(@RequestBody Choice choice) {
		
		choiceService.create(choice);
		return ResultBean.success(null);
	}
}
