package com.moglix.project.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.json.simple.JSONObject;
@Mapper
public interface TaskMapper {
	@Select("select * from task")
	public List<JSONObject> findTask();	
}
