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

import com.hha.dtos.AccountDTO;
import com.hha.entities.Account;
import com.hha.entities.Module;
import com.hha.entities.ModuleDetail;
import com.hha.services.AccountService;
import com.hha.services.ModuleDetailService;
import com.hha.services.ModuleService;

@RestController
@RequestMapping("/account")
public class AccountController {
	@Autowired
    private AccountService accServices;
    @Autowired
    private ModuleService ms;
    @Autowired
    private ModuleDetailService mds;
    @Autowired
    private ModelMapper mapper;
 // add
    @PostMapping("/add")
    public AccountDTO createBranch(@Validated @RequestBody AccountDTO accDto) {
        Account acc = convert2Entity(accDto);
        Account accCreated = accServices.create(acc);
        // set module name
        setModuleDetail("add");
        return convert2Dto(accCreated);
    }

    // update
    @PutMapping("/update/{id}")
    public String updateBranch(@RequestBody AccountDTO accDto, @PathVariable("id") Long id) {
        Account acc = convert2Entity(accDto);
        accServices.update(id, acc);
        // set module name
        setModuleDetail("update");
        return "Update Account " + id.toString() + " success";
    }

    // delete
    @DeleteMapping("/deleted/{id}")
    public String delete(@PathVariable("id") Long id) {
        // set module name
        setModuleDetail("delete");
        accServices.delete(id);
        return "Delete in db success";
    }

    // hidden
    @PutMapping("/delete/{id}")
    public String hidden(@PathVariable("id") Long id) {
        // set module name
        setModuleDetail("hidden");
        accServices.hidden(id);
        return "Hidden success";
    }

    // get one
    @GetMapping(value = "/{id}")
    public AccountDTO getOne(@PathVariable("id ") Long id) {
        Account acc = accServices.getById(id);
        // set module name
        setModuleDetail("get_one");
        return convert2Dto(acc);
    }

    // list all
    @GetMapping()
    public List<AccountDTO> getAll() {
        List<Account> list = accServices.getAll();
        setModuleDetail("list");
        return list.stream().map(this::convert2Dto).collect(Collectors.toList());
    }

    // set module name
    private void setModuleDetail(String moduleDetailName) {
        String moduleName = "account";
        Module moduleSelect = ms.getByName(moduleName);
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
    private AccountDTO convert2Dto(Account acc) {
    	AccountDTO accDTO = mapper.map(acc, AccountDTO.class);
        return accDTO;
    }

    private Account convert2Entity(AccountDTO accDTO) {
    	Account acc = mapper.map(accDTO, Account.class);
        return acc;
    }
}
