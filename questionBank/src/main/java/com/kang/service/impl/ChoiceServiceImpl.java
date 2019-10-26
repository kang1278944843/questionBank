package com.kang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kang.bean.Choice;
import com.kang.mapper.ChoiceMapper;
import com.kang.service.ChoiceService;

@Service
@Transactional
public class ChoiceServiceImpl implements ChoiceService{
	
	@Autowired
	private ChoiceMapper choiceMapper;

	@Override
	public void create(Choice choice) {
		
		
	}

	@Override
	public List<Choice> selectById(int id) {
		
		return null;
	}

	@Override
	public void updateById(int id) {
		
		
	}

	@Override
	public void deleteById(int id) {
		
		
	}
	
	

}
