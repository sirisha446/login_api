package com.example.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.UserInfo;
import com.example.beans.UserInfoRes;
import com.example.service.LoginService;
import com.example.util.LoginUtil;

@RestController
public class LoginController {

	@Autowired
	LoginService loginService;
	
	public ResponseEntity<UserInfoRes>loginAPi(@RequestBody @Valid UserInfo req){
		
		
		UserInfoRes res = loginService.loginAPi(req);
		
		return LoginUtil.responseEntityForFetchSuccessWithNoRecords(res);
		
	}
	
	
}
