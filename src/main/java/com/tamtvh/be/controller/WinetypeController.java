package com.tamtvh.be.controller;


import com.tamtvh.be.dto.WinetypeDTO;
import com.tamtvh.be.mapper.WinetypeMapper;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.message.response.CustomResponse;
import com.tamtvh.be.model.Winetype;
import com.tamtvh.be.service.WinetypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/winetype")
public class WinetypeController extends AbstractController<WinetypeService, WinetypeMapper, WinetypeDTO, Winetype> {

    @Autowired
    WinetypeService thisService;

    @Override
    public void initService() {
        service = thisService;
    }

    @Override
    public WinetypeService getService() {
        initService();
        return service;
    }

    private WinetypeMapper thisMapper;

    @Override
    public void initMapper() {
        mapper = thisMapper;
    }

    @Override
    public WinetypeMapper getMapper() {
        initMapper(thisMapper.INSTANCE);
        return mapper;
    }

    @GetMapping("/get-all")
    public ResponseEntity<?> getAllWinetype() {
        return getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getWinetypeById(@PathVariable Long id) {
        var entity = getService().findEntityById(id);
        var response = getMapper().toDto(entity, new CycleAvoidingMappingContext());
        return ResponseEntity.ok().body(new CustomResponse(200, "Get Winetype By Id " + id,
                response));
    }
}
