package com.hha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hha.entities.URPMD;

@Repository
public interface URPMDRepository extends JpaRepository<URPMD, Long>{
	@Query(value="select * from urpmd u wher u.user_id=:userId",nativeQuery=true)
	List<URPMD> getAllByUserId(@Param("userId") long id);
}
