package com.example.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beans.UserInfo;
import com.example.beans.UserInfoRes;
import com.example.dao.LoginDao;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginDao loginDao;

	@Override
	public UserInfoRes loginAPi(@Valid UserInfo req) {

		return loginDao.loginAPi(req);
	}
	
	
	
}
