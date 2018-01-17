package com.kjh.user.daoimpl;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sjh.admin.dao.TestDAO;
import com.sjh.admin.vo.BoardVO;

//@Repository
public class TestDAOImpl1 implements TestDAO {
	
	/*
	@Inject
	private SqlSession session;
	
	@Override
	public List<BoardVO> listAll() {
		
		return session.selectList("list");
	}*/

	@Override
	public List<BoardVO> listAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
