package com.kjh.user.service;

import java.util.List;
import com.kjh.user.vo.UserNoticeSearchVO;

public interface UserNoticeService {

	// �������� ����Ʈ
	public List<UserNoticeSearchVO> userNoticeList(UserNoticeSearchVO searchVO);
	
	// �������� �Խñ� ����
	public Integer userNoticeTotalCnt();
}
