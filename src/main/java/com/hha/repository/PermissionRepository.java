package com.hha.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hha.entities.EPermission;
import com.hha.entities.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long>{
	@Query(value="Select * from permission p where p.action =:action",nativeQuery=true)
	public Optional<Permission> findByAction(@Param("action") EPermission action);	
}
