package com.kjh.user.dao;

import java.util.List;
import com.kjh.user.vo.UserNoticeSearchVO;

public interface UserNoticeDAO {

	// �������� ����Ʈ
	public List<UserNoticeSearchVO> userNoticeList(UserNoticeSearchVO searchVO);
	
	// �������� ������ ����
	public Integer noticeTotalCnt();
}
