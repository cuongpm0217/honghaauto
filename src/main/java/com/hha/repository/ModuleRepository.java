package com.hha.repository;

import com.hha.entities.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ModuleRepository extends JpaRepository<Module, Long> {
    @Query(value = "Select * from module where name =:moduleName", nativeQuery = true)
    Optional<Module> findByName(@Param("moduleName") String moduleName);
}
