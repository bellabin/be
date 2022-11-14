package com.tamtvh.be.controller;

import com.tamtvh.be.dto.PhieudatDTO;
import com.tamtvh.be.mapper.PhieudatMapper;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.message.response.CustomResponse;
import com.tamtvh.be.model.Phieudat;
import com.tamtvh.be.service.PhieudatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/phieudat")
public class PhieudatController extends AbstractController<PhieudatService, PhieudatMapper, PhieudatDTO, Phieudat> {

    @Autowired
    PhieudatService thisService;

    @Override
    public void initService() {
        service = thisService;
    }

    @Override
    public PhieudatService getService() {
        initService();
        return service;
    }

    private PhieudatMapper thisMapper;

    @Override
    public void initMapper() {
        mapper = thisMapper;
    }

    @Override
    public PhieudatMapper getMapper() {
        initMapper(thisMapper.INSTANCE);
        return mapper;
    }

    @GetMapping("/get-all")
    public ResponseEntity<?> getAllPd() {
        return getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getPdById(@PathVariable Long id) {
        var entity = getService().findEntityById(id);
        var response = getMapper().toDto(entity, new CycleAvoidingMappingContext());
        return ResponseEntity.ok().body(new CustomResponse(200, "Get User By Id " + id,
                response));
    }
}
