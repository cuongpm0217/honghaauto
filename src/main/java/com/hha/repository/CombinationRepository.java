package com.hha.repository;

import com.hha.entities.Combination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CombinationRepository extends JpaRepository<Combination, Long> {
}
