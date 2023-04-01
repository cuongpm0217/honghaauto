package com.hha.controller;

import com.hha.dtos.BranchDTO;
import com.hha.entities.Branch;
import com.hha.entities.Module;
import com.hha.entities.ModuleDetail;
import com.hha.services.BranchService;
import com.hha.services.ModuleDetailService;
import com.hha.services.ModuleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/branch")
public class BranchController {
	@Autowired
	private BranchService bs;
	@Autowired
	private ModuleService ms;
	@Autowired
	private ModuleDetailService mds;
	@Autowired
	private ModelMapper mapper;

	// add
	@PostMapping("/add")
	public BranchDTO createBranch(@Validated @RequestBody BranchDTO bDto) {
		Branch brc = convert2Entity(bDto);
		Branch brcCreated = bs.createBranch(brc);
		// set module name		
		setModuleDetail("add");
		return convert2Dto(brcCreated);
	}

	// update
	@PutMapping("/update/{id}")
	public String updateBranch(@RequestBody BranchDTO bDto, @PathVariable("id") Long id) {
		Branch brc = convert2Entity(bDto);
		bs.updateBranch(id, brc);
		// set module name
		setModuleDetail("update");
		return "Update Branch " + id.toString() + " success";
	}

	// delete
	@DeleteMapping("/deleted/{id}")
	public String deleteBranch(@PathVariable("id") Long id) {
		// set module name
		setModuleDetail("delete");
		bs.deleteBranch(id);
		return "Delete in db success";
	}

	// hidden
	@PutMapping("/delete/{id}")
	public String hiddenBranch(@PathVariable("id") Long id) {
		// set module name
		setModuleDetail("hidden");		
		bs.hiddenBranch(id);
		return "Delete success";
	}

	// get one
	@GetMapping(value = "/{id}")
	public BranchDTO getBranch(@PathVariable("id ") Long id) {
		Branch brc = bs.getBranchById(id);
		// set module name
		setModuleDetail("get_one");
		return convert2Dto(brc);
	}

	// list all
	@GetMapping()
	public List<BranchDTO> getAllBranch() {
		List<Branch> list = bs.getAllBranch();
		setModuleDetail("list");
		return list.stream().map(this::convert2Dto).collect(Collectors.toList());
	}

	// set module name
		private void setModuleDetail(String moduleDetailName) {
			String moduleName = "branch";
			Module moduleSelect =  ms.getByName(moduleName );
			if (moduleSelect == null) {
				moduleSelect = new Module();
				moduleSelect.setName(moduleName);
				moduleSelect.setCreateDate(new Date());
				moduleSelect.setEnable(true);				
				ms.create(moduleSelect);			
				ModuleDetail md = mds.getByName(moduleSelect.getId(), moduleDetailName);
				if (md == null) {
					md = new ModuleDetail();
					md.setName(moduleDetailName);
					md.setCreateDate(new Date());
					md.setEnable(true);
					mds.create(md, moduleSelect.getId());
				}
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
