package com.kang.bean;

import java.util.List;

/**
 * 选择题模型
 * @author kangpengtao
 *
 */
public class Choice {
	
	private int id;
	
	/**
	 * 问题
	 */
	private String question;
	
	/**
	 * 选择类型1单选，2多选
	 */
	private int type;
	
	/**
	 * 章
	 */
	private String chapter;
	
	/**
	 * 节
	 */
	private String verse;
	
	/**
	 * 小节
	 */
	private String nodular;
	
	/**
	 * 标签
	 */
	private String tag;
	
	/**
	 * 状态 1有效 0无效
	 */
	private int status;
	
	/**
	 * 年级
	 */
	private int grade;
	
	/**
	 * 上下册 1上 2 下
	 */
	private int updown;
	
	/**
	 * 说明
	 */
	private String explain;
	
	/**
	 * 解析
	 */
	private String analysis;
	
	/**
	 * 知识点
	 */
	private String knowledge;
	
	private List<Option> options;

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getChapter() {
		return chapter;
	}

	public void setChapter(String chapter) {
		this.chapter = chapter;
	}

	public String getVerse() {
		return verse;
	}

	public void setVerse(String verse) {
		this.verse = verse;
	}

	public String getNodular() {
		return nodular;
	}

	public void setNodular(String nodular) {
		this.nodular = nodular;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getUpdown() {
		return updown;
	}

	public void setUpdown(int updown) {
		this.updown = updown;
	}

	public String getExplain() {
		return explain;
	}

	public void setExplain(String explain) {
		this.explain = explain;
	}

	public String getAnalysis() {
		return analysis;
	}

	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}

	public String getKnowledge() {
		return knowledge;
	}

	public void setKnowledge(String knowledge) {
		this.knowledge = knowledge;
	}
	

}
