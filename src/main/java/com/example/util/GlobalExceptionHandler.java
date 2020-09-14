package com.example.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.beans.UserInfoRes;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<UserInfoRes> exceptionHandler(Exception ex) {
		ex.printStackTrace();
		UserInfoRes responseMapper = new UserInfoRes();
		responseMapper.setMessage("Exception Occured");
		return new ResponseEntity<>(responseMapper, HttpStatus.INTERNAL_SERVER_ERROR);

	}
}
