package com.hha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hha.entities.EPermission;
import com.hha.entities.Permission;
import com.hha.repository.PermissionRepository;

@RestController
@RequestMapping("/per")
public class PermissionController {
	@Autowired
	PermissionRepository repo;
	@PostMapping("/add")
	public Permission create(@Validated @RequestBody Permission per) {
		Permission newPer = new Permission();
		newPer.setAction(EPermission.PERMISSION_FULL);
		return repo.save(newPer);
	}
}
