package com.hha.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hha.entities.ModuleDetail;

@Repository
public interface ModuleDetailRepository extends JpaRepository<ModuleDetail, Long>{
	@Query(value="select * from module_detail md where md.module_id=:module_id and md.name=:name",nativeQuery=true)
	Optional<ModuleDetail> findByName(@Param("module_id") Long moduleId,@Param("name") String name);
	
}
