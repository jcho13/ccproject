package com.sjh.admin.daoimpl;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sjh.admin.dao.AdminNoticeDAO;
import com.sjh.admin.vo.NoticeVO;

@Repository
public class AdminNoticeDAOImpl implements AdminNoticeDAO{

	@Inject
	private SqlSession session;

	@Override
	public void insertNotice(NoticeVO noticeVO) {
		
		if(noticeVO.getNno()==null){
			session.insert("insertNotice",noticeVO);
		}else {
			session.update("updateNotice",noticeVO);
		}
		
	}

	@Override
	public List<NoticeVO> noticeList() {
		
		return session.selectList("noticeList");
	}

	@Override
	public NoticeVO noticeRead(NoticeVO noticeVO) {
		
		return session.selectOne("noticeRead",noticeVO);
	}

	@Override
	public void noticeDelete(NoticeVO noticeVO) {
		
		session.update("noticeDelete",noticeVO);
	}

	@Override
	public Object noticeViewCnt(int nno) {
		return session.update("noticeViewCnt",nno);
		
	}
	
	
}
