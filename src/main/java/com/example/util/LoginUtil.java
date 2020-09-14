package com.example.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.example.beans.UserInfoRes;

@Component
public class LoginUtil {

	
	public static ResponseEntity<UserInfoRes> responseEntityForFetchSuccessWithNoRecords(UserInfoRes object) {

		UserInfoRes responseMapper = null;

		if (object.getIsUserExist()) {
			responseMapper = new UserInfoRes(object.getUserNm(), object.getFirstName(), object.getLastName(),
					object.getMobileNo(), object.getEmpId());
		} else {
			responseMapper = new UserInfoRes();
			responseMapper.setMessage("Please Enter Valid Credentials");

			return new ResponseEntity<>(responseMapper, HttpStatus.OK);

		}
		return null;

	}
}
