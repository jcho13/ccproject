package com.sjh.admin.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.sjh.admin.dao.AdminUserServiceDAO;
import com.sjh.admin.service.AdminUserService;
import com.sjh.admin.vo.BoardVO;
import com.sjh.admin.vo.Cpmember;

@Service
public class AdminUserServiceImpl implements AdminUserService {

	@Inject
	private AdminUserServiceDAO dao;

	//ȸ�� ���� ��ȸ
	@Override
	public List<Cpmember> companyInfo() {

		return dao.companyInfo();
	}
	//��ü �� ��ȸ
	@Override
	public int companyCnt() {
		
		return dao.companyCnt();
	}

	
	
}
