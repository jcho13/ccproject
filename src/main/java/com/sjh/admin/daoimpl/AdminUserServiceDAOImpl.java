package com.sjh.admin.daoimpl;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sjh.admin.dao.AdminUserServiceDAO;
import com.sjh.admin.vo.BoardVO;
import com.sjh.admin.vo.Cpmember;

@Repository
public class AdminUserServiceDAOImpl implements AdminUserServiceDAO {

	@Inject
	private SqlSession session;

	//업체 정보 조회
	@Override
	public List<Cpmember> companyInfo() {
		
		return session.selectList("companyInfo");
	}

	
}
