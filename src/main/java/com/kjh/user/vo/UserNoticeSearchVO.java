package com.kjh.user.vo;

public class UserNoticeSearchVO extends UserPageVO {
	
	//�˻� ����
	private String searchType ;
	//
	private String searchText ;
	
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getSearchText() {
		return searchText;
	}
	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}
	
	@Override
	public String toString() {
		return "SearchVO [searchType=" + searchType + ", searchText=" + searchText + "]";
	}
}
