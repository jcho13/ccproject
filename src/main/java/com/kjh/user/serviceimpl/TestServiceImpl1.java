package com.kjh.user.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.sjh.admin.dao.TestDAO;
import com.sjh.admin.service.TestService;
import com.sjh.admin.vo.BoardVO;

//@Service("service")
public class TestServiceImpl1 implements TestService {

	@Override
	public List<BoardVO> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

/*	@Inject
	private TestDAO dao;

	@Override
	public List<BoardVO> listAll() {
		
		return dao.listAll();
	}
	*/
}
