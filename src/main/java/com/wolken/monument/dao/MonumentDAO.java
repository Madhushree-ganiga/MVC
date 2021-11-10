package com.wolken.monument.dao;

import com.wolken.monument.entity.MonumentEntity;
import java.util.List;
public interface MonumentDAO {

	void save(MonumentEntity entity);
	

	List getAll();
}
