package com.sti.lending.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sti.lending.service.dto.AccountDto;
import com.sti.lending.service.dto.CommonResponse;
import com.sti.lending.service.dto.CustomerDto;
import com.sti.lending.service.dto.LoginRequest;

@RestController
@RequestMapping(value="/test")
public class TestController {

	@GetMapping(value="/hello")
	public String hello() {
		return "hello cuy";
	}
	
	@PostMapping(value="/login")
	public String post(@RequestBody LoginRequest login ) {
		String hasil;
		if(login.getUsername().equalsIgnoreCase("admin") && login.getPassword().equalsIgnoreCase("admin")) {
			hasil = "Login Sukses" ;
		}else {
			hasil = "gagal";
		}
	
		return hasil ;
		
	}
	
	@GetMapping(value="/customer")
	public CommonResponse<CustomerDto> getCustomer() {
		CustomerDto cust = new CustomerDto("dewa", "lampung", 21);
		CommonResponse<CustomerDto> res = new CommonResponse<>();
		res.setStatus("200");
		res.setMessage("Success");
		res.setValues(cust);
		
		return res;
	}
	
	@GetMapping(value="/account")
	public CommonResponse<AccountDto> getAccount() {
		AccountDto acc = new AccountDto(1, 10000);
		CommonResponse<AccountDto> res = new CommonResponse<>();
		res.setStatus("200");
		res.setMessage("Success");
		res.setValues(acc);
		
		return res;
	}
	
}
