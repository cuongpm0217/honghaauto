package com.hha.services.impl;

import com.hha.entities.URPMD;
import com.hha.entities.User;
import com.hha.repository.URPMDRepository;
import com.hha.repository.UserRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private URPMDRepository urpmdRepo;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUserName(username).orElseThrow(() -> new UsernameNotFoundException("User name:" + username + " NOT FOUND"));
        List<URPMD> list =  urpmdRepo.getAllByUserId(user.getId());
        List<String> listPermission = new ArrayList<String>();
        for (URPMD urpmd : list) {
        	HashMap<String, String> mapAuthor = new HashMap<>();
        	mapAuthor.put("userId", String.valueOf(urpmd.getUserId()));
        	mapAuthor.put("roleId", String.valueOf(urpmd.getRoleId()));
        	mapAuthor.put("permissionId", String.valueOf(urpmd.getPermissionId()));
        	mapAuthor.put("branchId", String.valueOf(urpmd.getBranchId()));
        	mapAuthor.put("moduleDetailId", String.valueOf(urpmd.getModuleDetailId()));
        	listPermission.add(mapAuthor.toString());
		}
        
		return UserDetailsImpl.build(user,listPermission);
    }

}
