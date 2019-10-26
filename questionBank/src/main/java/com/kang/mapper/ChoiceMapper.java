package com.kang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import com.kang.bean.Choice;

@Mapper
public interface ChoiceMapper {

	public void create(Choice choice);

	public List<Choice> selectById(int id);

	public void updateById(int id);

	@Delete("delete from choice where id = #{id}")
	public void deleteById(int id);

}
