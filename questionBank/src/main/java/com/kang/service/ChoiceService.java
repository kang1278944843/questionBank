package com.kang.service;

import java.util.List;

import com.kang.bean.Choice;

public interface ChoiceService {
	
	public void create(Choice choice);
	
	public List<Choice> selectById(int id);
	
	public void updateById(int id);
	
	public void deleteById(int id);

}
