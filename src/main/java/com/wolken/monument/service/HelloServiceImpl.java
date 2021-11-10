package com.wolken.monument.service;
import java.util.List;

import org.springframework.stereotype.Component;

import com.wolken.monument.dto.DetailsDTO;

@Component
public class HelloServiceImpl implements HelloService {

	public void printHello() {
		System.out.println("Hello service");

	}

	public List getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void validateandsave(DetailsDTO dto) {
		// TODO Auto-generated method stub
		
	}

}
