package com.sjh.admin.service;

import java.util.List;


import com.sjh.admin.vo.Cpmember;

public interface AdminUserService {
	
	//��ü ��
	public int companyCnt();

	public List<Cpmember> companyInfo();
}
