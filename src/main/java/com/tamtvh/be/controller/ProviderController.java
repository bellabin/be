package com.tamtvh.be.controller;

import com.tamtvh.be.dto.ProviderDTO;
import com.tamtvh.be.mapper.ProviderMapper;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.message.response.CustomResponse;
import com.tamtvh.be.model.Provider;
import com.tamtvh.be.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/provider")
public class ProviderController extends AbstractController<ProviderService, ProviderMapper, ProviderDTO, Provider> {

    @Autowired
    ProviderService thisService;

    @Override
    public void initService() {
        service = thisService;
    }

    @Override
    public ProviderService getService() {
        initService();
        return service;
    }

    private ProviderMapper thisMapper;

    @Override
    public void initMapper() {
        mapper = thisMapper;
    }

    @Override
    public ProviderMapper getMapper() {
        initMapper(thisMapper.INSTANCE);
        return mapper;
    }

    @GetMapping("/get-all")
    public ResponseEntity<?> getAllRole() {
        return getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getRoleById(@PathVariable Long id) {
        var entity = getService().findEntityById(id);
        var response = getMapper().toDto(entity, new CycleAvoidingMappingContext());
        return ResponseEntity.ok().body(new CustomResponse(200, "Get Role By Id " + id,
                response));
    }
}
