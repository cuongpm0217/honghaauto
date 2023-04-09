package com.hha.repository;

import com.hha.entities.BranchDep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BranchDepRepository extends JpaRepository<BranchDep, Long> {
    @Query(value = "select * from branch_dep bd where bd.dep_id=:dep_id", nativeQuery = true)
    List<BranchDep> findAllByDepId(@Param("dep_id") long id);

    @Query(value = "select * from branch_dep bd where bd.branch_id=:branch_id;", nativeQuery = true)
    List<BranchDep> findAllByBranchId(@Param("branch_id") long id);

}
