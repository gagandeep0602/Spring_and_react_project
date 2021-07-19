package com.moglix.project.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.json.simple.JSONObject;

@Mapper
public interface InterviewMapper {
	
	@Select("select * from interview")
	public List<JSONObject> findInterview();	
}
