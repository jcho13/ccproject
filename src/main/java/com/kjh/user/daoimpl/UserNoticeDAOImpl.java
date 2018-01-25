package com.kjh.user.daoimpl;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kjh.user.dao.UserNoticeDAO;
import com.kjh.user.vo.UserNoticeSearchVO;

@Repository
public class UserNoticeDAOImpl implements UserNoticeDAO {
	
	@Inject
	private SqlSession session;

	@Override
	public List<UserNoticeSearchVO> userNoticeList(UserNoticeSearchVO searchVO) {
		
		return session.selectList("noticeList", searchVO);
	}
	
	@Override
	public Integer noticeTotalCnt() {
		return session.selectOne("noticeCnt");
	}
}
