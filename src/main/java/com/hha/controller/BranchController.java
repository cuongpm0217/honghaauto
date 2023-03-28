package com.hha.controller;

import java.util.List;
import java.util.stream.Collector;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hha.dtos.BranchDTO;
import com.hha.entities.Branch;
import com.hha.services.BranchService;

@RestController
@RequestMapping("/branch")
public class BranchController {
	@Autowired
	private BranchService bs;
	@Autowired
	private ModelMapper mapper;
	//add
	@PostMapping("/add")
	public BranchDTO createBranch(@Validated @RequestBody BranchDTO bDto) {
		Branch brc = convert2Entity(bDto);
		Branch brcCreated = bs.createBranch(brc);
		return convert2Dto(brcCreated);
	}
	//update
	@PutMapping("/update/{id}")
	public String updateBranch(@RequestBody BranchDTO bDto,@PathVariable("id") Long id) {
		Branch brc = convert2Entity(bDto);
		bs.updateBranch(id, brc);
		return "Update Branch "+id.toString()+" success";
	} 
	//delete
	@DeleteMapping("/deleted/{id}")
	public String deleteBranch(@PathVariable("id") Long id) {
		bs.deleteBranch(id);
		return "Delete in db success";
	}
	//hidden
	@PutMapping("/delete/{id}")
	public String hiddenBranch(@PathVariable("id") Long id) {
		bs.hiddenBranch(id);
		return "Delete success";
	}
	//get one
	@GetMapping(value="/{id}")
	@ResponseBody
	public BranchDTO getBranch(@PathVariable("id ") Long id) {
		Branch brc = bs.getBranchById(id);
		return convert2Dto(brc);
	}
	//list all
	@GetMapping()
	public List<BranchDTO> getAllBranch(){
		List<Branch> list = bs.getAllBranch();
		return list.stream().map(this::convert2Dto).collect(Collectors.toList());
	}
	//converter
	private BranchDTO convert2Dto(Branch brc) {
		BranchDTO bDTO = mapper.map(brc,BranchDTO.class);
		return bDTO;
	}
	private Branch convert2Entity(BranchDTO bDTO) {
		Branch brc = mapper.map(bDTO, Branch.class);
		return brc;		
	}
	
}
