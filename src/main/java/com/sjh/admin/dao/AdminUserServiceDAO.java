package com.sjh.admin.dao;

import java.util.List;

import com.sjh.admin.vo.CPageVO;
import com.sjh.admin.vo.Cpmember;

public interface AdminUserServiceDAO {

	public List<Cpmember> companyInfo();
	
	public int companyCnt();
	
	//∆‰¿Ã¬°
	public List<Cpmember> listPage(int page)throws Exception;
	public List<Cpmember> listPageVO(CPageVO cpageVO)throws Exception;
	
}
