package com.sjh.admin.daoimpl;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sjh.admin.dao.AdminUserServiceDAO;
import com.sjh.admin.vo.CPageVO;
import com.sjh.admin.vo.Cpmember;

@Repository
public class AdminUserServiceDAOImpl implements AdminUserServiceDAO {

	@Inject
	private SqlSession session;

	//��ü ���� ��ȸ
	@Override
	public List<Cpmember> companyInfo() {
		
		return session.selectList("companyInfo");
	}
	//��ü �� ��ȸ
	@Override
	public int companyCnt() {
		
		return session.selectOne("companyCnt");
	}
	//����¡ 
	@Override
	public List<Cpmember> listPage(int page) throws Exception {
		if(page <=0) {
			page = 1;
		}
		page = (page -1) * 10;
		return session.selectList("listPage",page);
	}
	@Override
	public List<Cpmember> listPageVO(CPageVO cpageVO) throws Exception {
		
		return session.selectList("cpageVO",cpageVO);
	}

	
}
