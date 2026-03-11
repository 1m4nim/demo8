package com.example.demo8.mock;

import org.springframework.stereotype.Service;

import com.example.demo8.service.RegistService;

@Service
public class RegistServiceMock implements RegistService {

	@Override
	public String regist() {
		
		return "テスト的に動きました。";

	}

}
