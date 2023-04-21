package com.hha.services.impl;

import com.hha.entities.URPMD;
import com.hha.entities.User;
import com.hha.repository.URPMDRepository;
import com.hha.repository.UserRepository;
import com.hha.services.UserService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserDetailsService, UserService {
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private URPMDRepository urpmdRepo;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.findByUserName(username)
				.orElseThrow(() -> new UsernameNotFoundException("User name:" + username + " NOT FOUND"));
		List<URPMD> list = urpmdRepo.getAllByUserId(user.getId());
		List<String> listPermission = new ArrayList<String>();
		if (!list.isEmpty()) {
			for (URPMD urpmd : list) {
				HashMap<String, String> mapAuthor = new HashMap<>();
				mapAuthor.put("userId", String.valueOf(urpmd.getUserId()));
				mapAuthor.put("roleId", String.valueOf(urpmd.getRoleId()));
				mapAuthor.put("permissionId", String.valueOf(urpmd.getPermissionId()));
				mapAuthor.put("branchId", String.valueOf(urpmd.getBranchId()));
				mapAuthor.put("moduleDetailId", String.valueOf(urpmd.getModuleDetailId()));
				listPermission.add(mapAuthor.toString());
			}
		}
		
		return UserDetailsImpl.build(user, listPermission);
	}

	@Override
	public User create(User user) {
		user.setEnable(true);
		return userRepo.save(user);
	}

	@Override
	public User update(long id, User user) {
		Optional<User> row = userRepo.findById(id);
		if (user != null || row.isPresent()) {
			User userSelect = row.get();
			userSelect.setEmail(user.getEmail());
			userSelect.setEnable(user.isEnable());
			userSelect.setPassWord(user.getPassWord());
			userSelect.setUserName(user.getUserName());
			return userRepo.save(userSelect);
		} else {
			return null;
		}
	}

	@Override
	public void delete(long id) {
		userRepo.deleteById(id);
	}

	@Override
	public boolean hidden(long id) {
		Optional<User> row = userRepo.findById(id);
		if (row.isPresent()) {
			User userSelect = row.get();
			userSelect.setEnable(false);
			userRepo.save(userSelect);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public User getById(long id) {
		Optional<User> row = userRepo.findById(id);
		if (row.isPresent()) {
			return row.get();
		} else
			return null;
	}

	@Override
	public List<User> getAll() {
		return userRepo.findAll();
	}

}
