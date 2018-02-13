package com.sjh.admin.vo;

public class CPageVO {

	private int page;
	private int perPageNum;
	
	public CPageVO() {
		this.page = 1;
		this.perPageNum = 10;
	}
	//page SET
	public void setPage(int page) {
		
		if(page <=0) {
			this.page = 1;
			return;
		}
		
		this.page = page;
	}
	//PerPageNum SET
	public void setPerPageNum(int perPageNum) {
		
		if(perPageNum <=0 || perPageNum >100) {
			this.perPageNum = 10;
			return;
		}
		
		this.perPageNum = perPageNum;
	}
	

	public int getPage() {
		return page;
	}

	//method for Mybatis SQL Mapper
	public int getPageStart() {
		return (this.page-1) * perPageNum;
	}

	public int getPerPageNum() {
		return perPageNum;
	}

	
	
	
	
}
