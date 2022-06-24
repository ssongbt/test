package com.example.svc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dao.TestDAO;
import com.example.vo.TestVO;

@Service
public class TestSVC {
	
	@Autowired TestDAO dao;

	public boolean memberJoin(TestVO test) {
		return dao.memberJoin(test);
	}
	
	public boolean idCheck(String uid) {
		return dao.idCheck(uid);
	}

}
