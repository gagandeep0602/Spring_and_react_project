package com.moglix.project.Mapper;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.json.simple.JSONObject;




@Mapper
public interface EmployeeMapper {

@Select("select * from employee")
public List<JSONObject> findEmployee();
	
	
}
