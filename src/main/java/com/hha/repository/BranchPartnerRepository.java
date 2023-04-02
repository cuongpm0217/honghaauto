package com.hha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hha.entities.BranchPartner;

@Repository
public interface BranchPartnerRepository extends JpaRepository<BranchPartner, Long>{
	@Query(value="select * from branch_partner where branch_id=:brc_id",nativeQuery=true)
	List<BranchPartner> getAllByBranchId(@Param("brc_id") long id);
	@Query(value="select * from branch_partner where partner_id=:p_id",nativeQuery=true)
	List<BranchPartner> getAllByPartnerId(@Param("p_id")long id);

}
