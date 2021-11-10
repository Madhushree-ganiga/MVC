package com.wolken.monument.service;

import java.util.List;

import com.wolken.monument.dto.DetailsDTO;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wolken.monument.dao.MonumentDAO;
import com.wolken.monument.dto.DetailsDTO;
import com.wolken.monument.entity.MonumentEntity;

@Component
public class MonumentServiceImpl implements MonumentService {
	@Autowired
	MonumentDAO dao;
	public void validateandsave(DetailsDTO dto) {
		if(!dto.getName().equals(null)&& !dto.getName().equals("")) {
			if(!dto.getLocation().equals(null)&& !dto.getLocation().equals("")) {
				if(dto.getYOC()>0) {
					
						if(dto.getEntryFee()>0) {
							MonumentEntity entity=new MonumentEntity();
							BeanUtils.copyProperties(dto, entity);
							dao.save(entity);
						}else {
							System.out.println("invalid entry fee");
						}
					
				}else {
					System.out.println("invalid year");
				}
			}else {
				System.out.println("invalid location");
			}
		}else {
			System.out.println("invalid name");
		}
		
	}
	public List getAll() {
		MonumentEntity entity=new MonumentEntity();
		List list=dao.getAll();
		return list;
	}

}
	