package com.example.dao;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.beans.UserInfo;
import com.example.beans.UserInfoRes;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public UserInfoRes loginAPi(@Valid UserInfo req) {
		
		
	
		UserInfoRes res = new UserInfoRes();

		 if(req!= null){
		
		    Boolean flag = false;
		       
		     String checkEmployeeExistOrNot="select exists(select 1 from employees_info_ref where lower(emp_user_nm)=lower(:userNm) and org_id=:orgId)";
		
		     flag =namedParameterJdbcTemplate.queryForObject(checkEmployeeExistOrNot, new BeanPropertySqlParameterSource(req),Boolean.class);
		
		     if(flag){
		
		    	 res.setIsUserExist(true);
		
		    
		       String fetchEmployeeDetails ="select emp_user_nm,fisrt_nm,last_nm,mobile_no,emp_id from employess_info_ref where lower(emp_user_nm)=lower(:userNm) and org_id=:orgId ";
		    
		           res =namedParameterJdbcTemplate.queryForObject(fetchEmployeeDetails,new BeanPropertySqlParameterSource(req),
						new BeanPropertyRowMapper<UserInfoRes>(UserInfoRes.class));
		
		}
		    
		      else{
		
		    	  res.setIsUserExist(true);
		  		
		
		}
	}
		 
		 return res;
	}
	
	
}
