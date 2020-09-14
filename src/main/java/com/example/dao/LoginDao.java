package com.example.dao;

import javax.validation.Valid;

import com.example.beans.UserInfo;
import com.example.beans.UserInfoRes;

public interface LoginDao {

	public UserInfoRes loginAPi(@Valid UserInfo req);

}
