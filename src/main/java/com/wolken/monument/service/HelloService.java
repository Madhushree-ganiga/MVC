package com.wolken.monument.service;

import java.util.List;

import com.wolken.monument.dto.DetailsDTO;

public interface HelloService {
	void printHello();

	List getAll();

	void validateandsave(DetailsDTO dto);
}
