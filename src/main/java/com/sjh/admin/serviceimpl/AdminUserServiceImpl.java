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

	//회사 정보 조회
	@Override
	public List<Cpmember> companyInfo() {

		return dao.companyInfo();
	}
	//업체 수 조회
	@Override
	public int companyCnt() {
		
		return dao.companyCnt();
	}

	
	
}
