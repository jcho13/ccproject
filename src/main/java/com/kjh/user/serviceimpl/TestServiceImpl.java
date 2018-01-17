package com.kjh.user.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.sjh.admin.dao.TestDAO;
import com.sjh.admin.service.TestService;
import com.sjh.admin.vo.BoardVO;

@Service("service")
public class TestServiceImpl implements TestService {

	@Inject
	private TestDAO dao;

	@Override
	public List<BoardVO> listAll() {
		
		return dao.listAll();
	}
	
}
