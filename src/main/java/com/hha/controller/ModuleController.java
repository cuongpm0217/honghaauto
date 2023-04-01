package com.hha.controller;

import com.hha.dtos.ModuleDTO;
import com.hha.entities.Module;
import com.hha.entities.ModuleDetail;
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
@RequestMapping("/module")
public class ModuleController {
	@Autowired	
	private ModuleService ms;		
	@Autowired
	private ModuleDetailService mds;
	@Autowired
	private ModelMapper mapper;
	// add
	@PostMapping("/add")
	public ModuleDTO createBranch(@Validated @RequestBody ModuleDTO mDto) {
		Module m = convert2Entity(mDto);
		Module mCreated = ms.create(m);
		// set module name
		String moduleName = "add";
		setModuleDetail(moduleName);
		return convert2Dto(mCreated);
	}

	// update
	@PutMapping("/update/{id}")
	public String updateBranch(@RequestBody ModuleDTO mDto, @PathVariable("id") Long id) {
		Module m = convert2Entity(mDto);
		ms.update(id, m);
		// set module name		
		setModuleDetail("update");
		return "Update module " + id.toString() + " success";
	}

	// delete
	@DeleteMapping("/deleted/{id}")
	public String deleteBranch(@PathVariable("id") Long id) {
		// set module name	
		setModuleDetail("delete");
		ms.delete(id);
		return "Delete in db success";
	}

	// hidden
	@PutMapping("/delete/{id}")
	public String hiddenBranch(@PathVariable("id") Long id) {
		// set module name
		setModuleDetail("hidden");
		ms.hidden(id);
		return "Hidden success";
	}

	// get one
	@GetMapping(value = "/{id}")
	public ModuleDTO getBranch(@PathVariable("id ") Long id) {
		Module m = ms.getById(id);
		// set module name
		setModuleDetail("getone");
		return convert2Dto(m);
	}

	// list all
	@GetMapping()
	public List<ModuleDTO> getAllBranch() {
		setModuleDetail("list");
		List<Module> list = ms.getAll();		
		return list.stream().map(this::convert2Dto).collect(Collectors.toList());
	}

	// set module name
	private void setModuleDetail(String moduleDetailName) {
		String moduleName = "module";
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
	private ModuleDTO convert2Dto(Module module) {
		ModuleDTO mDTO = mapper.map(module, ModuleDTO.class);
		return mDTO;
	}

	private Module convert2Entity(ModuleDTO mDTO) {
		Module m = mapper.map(mDTO, Module.class);
		return m;
	}
}
