package com.hha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hha.entities.Branch;
@Repository
public interface BranchRepository extends JpaRepository<Branch, Long>{

}
