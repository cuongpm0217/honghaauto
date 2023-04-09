package com.hha.controller;

import com.hha.dtos.CurrencyDTO;
import com.hha.entities.Currency;
import com.hha.entities.Module;
import com.hha.entities.ModuleDetail;
import com.hha.services.CurrencyService;
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
@RequestMapping("/currency")
@CrossOrigin(origins = "*")
public class CurrencyController {
    @Autowired
    private CurrencyService currencySv;
    @Autowired
    private ModuleService ms;
    @Autowired
    private ModuleDetailService mds;
    @Autowired
    private ModelMapper mapper;

    // add
    @PostMapping("/add")
    public CurrencyDTO create(@Validated @RequestBody CurrencyDTO currencyDTO) {
        Currency currency = convert2Entity(currencyDTO);
        Currency currencyCreate = currencySv.create(currency);
        // set module name
        setModuleDetail("add");
        return convert2Dto(currencyCreate);
    }

    // update
    @PutMapping("/update/{id}")
    public String update(@RequestBody CurrencyDTO curDTO, @PathVariable("id") Long id) {
        Currency curUpdate = convert2Entity(curDTO);
        currencySv.update(id, curUpdate);
        // set module name
        setModuleDetail("update");
        return "Update Currency " + curUpdate.getName() + " success";
    }

    // delete
    @DeleteMapping("/deleted/{id}")
    public String delete(@PathVariable("id") Long id) {
        // set module name
        setModuleDetail("delete");
        currencySv.delete(id);
        return "Delete in db success";
    }

    // hidden
    @PutMapping("/delete/{id}")
    public String hidden(@PathVariable("id") Long id) {
        // set module name
        setModuleDetail("hidden");
        currencySv.hidden(id);
        return "Hidden success";
    }

    // get one
    @GetMapping(value = "/{id}")
    public CurrencyDTO getById(@PathVariable("id ") Long id) {
        Currency cur = currencySv.getById(id);
        // set module name
        setModuleDetail("get_one");
        return convert2Dto(cur);
    }

    // list all
    @GetMapping()
    public List<CurrencyDTO> getAllBranch() {
        List<Currency> list = currencySv.getAll();
        setModuleDetail("list");
        return list.stream().map(this::convert2Dto).collect(Collectors.toList());
    }

    // set module name
    private void setModuleDetail(String moduleDetailName) {
        String moduleName = "currency";
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
    private CurrencyDTO convert2Dto(Currency cur) {
        CurrencyDTO curDTO = mapper.map(cur, CurrencyDTO.class);
        return curDTO;
    }

    private Currency convert2Entity(CurrencyDTO currencyDTO) {
        Currency cur = mapper.map(currencyDTO, Currency.class);
        return cur;
    }
}
