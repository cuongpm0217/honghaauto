package com.hha.repository;

import com.hha.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query(value = "select * from employee emp where emp.branch_id=:branch_id and emp.dep_id=:dep_id "
            + "and (emp.name like %:txtSearch or emp.add1 like %:txtSearch or emp.add2 like %:txtSearch "
            + "or emp.tel1 like %:txtSearch or emp.tel2 like %:txtSearch or emp.national_id like %:txtSearch);", nativeQuery = true)
    List<Employee> getEmployeeByText(@Param("txtSearch") String txtSearch, @Param("branch_id") long branchId,
                                     @Param("dep_id") long depId);

    @Query(value = "select * from employee emp where emp.branch_id=:branch_id;", nativeQuery = true)
    List<Employee> getAllByBranchId(@Param("branch_id") long branchId);

    @Query(value = "select * from employee emp where emp.branch_id=:branch_id and emp.dep_id=:dep_id", nativeQuery = true)
    List<Employee> getAllByDepId(@Param("branch_id") long branchId, @Param("dep_id") long depId);

}
