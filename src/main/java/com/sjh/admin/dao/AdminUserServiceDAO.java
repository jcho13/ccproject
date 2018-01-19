package com.sjh.admin.dao;

import java.util.List;

import com.sjh.admin.vo.BoardVO;
import com.sjh.admin.vo.Cpmember;

public interface AdminUserServiceDAO {

	public List<Cpmember> companyInfo();
	
	public int companyCnt();
}
