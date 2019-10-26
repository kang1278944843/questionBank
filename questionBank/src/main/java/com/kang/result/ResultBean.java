package com.kang.result;

import java.io.Serializable;


public class ResultBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final int SUCCESS=200;
	
	private static final int ERROR=500;
	
	private int code;
	private String message;
	private Object data;
	
	public <T> ResultBean(int code, String message, T data){
		this.code = code;
		this.message = message;
		this.data = data;
	}
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@SuppressWarnings("unchecked")
	public <T> T getData() {
		return (T) data;
	}

	public <T> void setData(T data) {
		this.data = data;
	}
	
	public static <T> ResultBean success(T data){
		return success(data, "success");
	}

	public static <T> ResultBean success(T data, String message){
		return new ResultBean(SUCCESS, message, data);
	}
	public static <T> ResultBean error(Throwable e){
		return new ResultBean(ERROR, e.getMessage(), null);
	}
	public static <T> ResultBean error(String message){
		return new ResultBean(ERROR, message, null);
	}
	public static <T> ResultBean error(int code, String message){
		return new ResultBean(code, message, null);
	}
	

}
