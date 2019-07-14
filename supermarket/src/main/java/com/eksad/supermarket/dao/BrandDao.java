package com.eksad.supermarket.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.eksad.supermarket.entity.Brand;

public interface BrandDao extends CrudRepository<Brand, Long>
 {
	
	public Brand findOneByName(String name);
	public List<Brand>findByName(String name);
	public List<Brand>findByProductType(String type);
	
	@Query("select b from Brand b where name = : search")
	public List<Brand>findBySearch(@Param("search")String search);
	
}
