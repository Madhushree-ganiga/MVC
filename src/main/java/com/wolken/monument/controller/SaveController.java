package com.wolken.monument.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wolken.monument.dao.MonumentDAO;
import com.wolken.monument.dto.DetailsDTO;
import com.wolken.monument.entity.MonumentEntity;
import com.wolken.monument.service.HelloService;

@Controller
public class SaveController {
	@Autowired
	//MonumentDAO dao;
	HelloService service;
	@RequestMapping(value="save", method = RequestMethod.POST)
	ModelAndView saveDetails(DetailsDTO dto) {
		ModelAndView view=new ModelAndView();
		System.out.println(dto);
		MonumentEntity entity=new MonumentEntity();
		//BeanUtils.copyProperties(dto, entity);
		service.validateandsave(dto);
		
		view.setViewName("hello");
		view.addObject("msg", "Data Saved");
		view.addObject("data", dto);
		return view;
	}
	@RequestMapping("getAll")
	ModelAndView getAll() {
		ModelAndView view=new ModelAndView("hello");
		List list=service.getAll();
		view.addObject("list", list);
		return view;
	}
}