package com.backgrand.domain;

public class ResultDO<E> {
	
	private Boolean success;
	private E module;
	private String errorMsg;
	
	public ResultDO() {}
	
	public ResultDO(Boolean b) {
		this.success = b;
	}
	
	/*public static ResultDO<?> getInstance(Boolean b){
		return new ResultDO(b);
	}
	*/
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public E getModule() {
		return module;
	}

	public void setModule(E module) {
		this.module = module;
	}
	
}
