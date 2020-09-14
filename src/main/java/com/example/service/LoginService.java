package com.example.service;

import javax.validation.Valid;

import com.example.beans.UserInfo;
import com.example.beans.UserInfoRes;

public interface LoginService {

	public UserInfoRes loginAPi(@Valid UserInfo req);

}
