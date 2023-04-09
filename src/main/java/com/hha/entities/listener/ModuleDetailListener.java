package com.hha.entities.listener;

import com.hha.entities.ModuleDetail;

import javax.persistence.PostPersist;

public class ModuleDetailListener {
    @PostPersist
    private void afterAdd(ModuleDetail md) {
        // call service add user with role_admin + permission_full to URPMD
    }
}
