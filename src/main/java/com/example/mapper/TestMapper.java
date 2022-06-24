package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.vo.TestVO;

@Mapper
public interface TestMapper {

	int memberJoin(TestVO test);
	TestVO getUid(String uid);

}
