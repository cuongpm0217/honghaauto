package com.hha.controller;

import com.hha.dtos.ColorDTO;
import com.hha.entities.Color;
import com.hha.entities.Module;
import com.hha.entities.ModuleDetail;
import com.hha.services.ColorService;
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
@RequestMapping("/color")
@CrossOrigin(origins = "*")
public class ColorController {
    @Autowired
    private ColorService colorSv;
    @Autowired
    private ModuleService ms;
    @Autowired
    private ModuleDetailService mds;
    @Autowired
    private ModelMapper mapper;

    // add
    @PostMapping("/add")
    public ColorDTO create(@Validated @RequestBody ColorDTO colorDTO) {
        Color color = convert2Entity(colorDTO);
        Color colorCreate = colorSv.createColor(color);
        // set module name
        setModuleDetail("add");
        return convert2Dto(colorCreate);
    }

    // update
    @PutMapping("/update/{id}")
    public String update(@RequestBody ColorDTO colorDTO, @PathVariable("id") Long id) {
        Color colorUpdate = convert2Entity(colorDTO);
        colorSv.updateColor(id, colorUpdate);
        // set module name
        setModuleDetail("update");
        return "Update Color " + colorDTO.getName() + " success";
    }

    // delete
    @DeleteMapping("/deleted/{id}")
    public String delete(@PathVariable("id") Long id) {
        // set module name
        setModuleDetail("delete");
        colorSv.deleteColor(id);
        return "Delete in db success";
    }

    // hidden
    @PutMapping("/delete/{id}")
    public String hidden(@PathVariable("id") Long id) {
        // set module name
        setModuleDetail("hidden");
        colorSv.hiddenColor(id);
        return "Hidden success";
    }

    // get one
    @GetMapping(value = "/{id}")
    public ColorDTO getById(@PathVariable("id ") Long id) {
        Color color = colorSv.getColorById(id);
        // set module name
        setModuleDetail("get_one");
        return convert2Dto(color);
    }

    // list all
    @GetMapping()
    public List<ColorDTO> getAllBranch() {
        List<Color> list = colorSv.getAllColor();
        setModuleDetail("list");
        return list.stream().map(this::convert2Dto).collect(Collectors.toList());
    }

    // set module name
    private void setModuleDetail(String moduleDetailName) {
        String moduleName = "color";
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
    private ColorDTO convert2Dto(Color color) {
        ColorDTO colorDTO = mapper.map(color, ColorDTO.class);
        return colorDTO;
    }

    private Color convert2Entity(ColorDTO colorDTO) {
        Color color = mapper.map(colorDTO, Color.class);
        return color;
    }

}
