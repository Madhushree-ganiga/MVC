package com.wolken.monument.service;

import java.util.List;

import com.wolken.monument.dto.DetailsDTO;

public interface MonumentService {

	void validateandsave(DetailsDTO dto);

	List getAll();

}