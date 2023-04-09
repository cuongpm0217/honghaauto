package com.hha.services;

import com.hha.entities.BranchDep;

import java.util.List;

public interface BranchDepService {
    BranchDep createBranchDep(BranchDep branchDep);

    BranchDep updateBranchDep(long id, BranchDep branchDep);

    void deleteBranchDep(long id);

    boolean hiddenBranchDep(long id);

    BranchDep getBranchDepById(long id);

    List<BranchDep> getAllBranchDep();

    List<BranchDep> getAllBranchDepByDepId(long id);

    List<BranchDep> getAllBranchDepByBranchId(long id);
}
