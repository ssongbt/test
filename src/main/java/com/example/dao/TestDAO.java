package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.mapper.TestMapper;
import com.example.vo.TestVO;

@Repository
public class TestDAO {
	
	@Autowired TestMapper mapper;

	public boolean memberJoin(TestVO test) {
		return mapper.memberJoin(test)>0;
	}

	public Boolean idCheck(String uid) {
		return (mapper.getUid(uid)==null);
	}

}
