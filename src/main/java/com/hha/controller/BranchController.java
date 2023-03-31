package com.hha.controller;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hha.dtos.BranchDTO;
import com.hha.entities.Branch;
import com.hha.entities.Module;
import com.hha.services.BranchService;
import com.hha.services.ModuleService;

@RestController
@RequestMapping("/branch")
public class BranchController {
	@Autowired
	private BranchService bs;
	@Autowired
	private ModuleService ms;
	@Autowired
	private ModelMapper mapper;

	// add
	@PostMapping("/add")
	public BranchDTO createBranch(@Validated @RequestBody BranchDTO bDto) {
		Branch brc = convert2Entity(bDto);
		Branch brcCreated = bs.createBranch(brc);
		// set module name
		String moduleName = "branch_add";
		setModule(moduleName);
		return convert2Dto(brcCreated);
	}

	// update
	@PutMapping("/update/{id}")
	public String updateBranch(@RequestBody BranchDTO bDto, @PathVariable("id") Long id) {
		Branch brc = convert2Entity(bDto);
		bs.updateBranch(id, brc);
		// set module name
		String moduleName = "branch_update";
		setModule(moduleName);
		return "Update Branch " + id.toString() + " success";
	}

	// delete
	@DeleteMapping("/deleted/{id}")
	public String deleteBranch(@PathVariable("id") Long id) {
		// set module name
		String moduleName = "branch_delete";
		setModule(moduleName);
		bs.deleteBranch(id);
		return "Delete in db success";
	}

	// hidden
	@PutMapping("/delete/{id}")
	public String hiddenBranch(@PathVariable("id") Long id) {
		// set module name
		String moduleName = "branch_hidden";
		setModule(moduleName);
		bs.hiddenBranch(id);
		return "Delete success";
	}

	// get one
	@GetMapping(value = "/{id}")
	public BranchDTO getBranch(@PathVariable("id ") Long id) {
		Branch brc = bs.getBranchById(id);
		// set module name
		String moduleName = "branch_getone";
		setModule(moduleName);
		return convert2Dto(brc);
	}

	// list all
	@GetMapping()
	public List<BranchDTO> getAllBranch() {
		List<Branch> list = bs.getAllBranch();
		String moduleName = "branch_list";
		setModule(moduleName);
		return list.stream().map(this::convert2Dto).collect(Collectors.toList());
	}

	// set module name
	private void setModule(String moduleName) {
		Module m = ms.getByName(moduleName);
		if (m == null) {
			m = new Module();
			m.setName(moduleName);
			m.setCreateDate(new Date());
			m.setEnable(true);
			ms.create(m);
		}
	}

	// converter
	private BranchDTO convert2Dto(Branch brc) {
		BranchDTO bDTO = mapper.map(brc, BranchDTO.class);
		return bDTO;
	}

	private Branch convert2Entity(BranchDTO bDTO) {
		Branch brc = mapper.map(bDTO, Branch.class);
		return brc;
	}

}
