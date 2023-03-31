package com.hha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hha.entities.Module;

@Repository
public interface ModuleRepository extends JpaRepository<Module, Long>{
	@Query(value="Select * from module where name ='?'",nativeQuery=true)
	public Module findByName(String moduleName);
}
