package com.tamtvh.be.controller;

import com.tamtvh.be.dto.ChangePriceDTO;
import com.tamtvh.be.mapper.ChangePriceMapper;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.message.response.CustomResponse;
import com.tamtvh.be.model.ChangePrice;
import com.tamtvh.be.service.ChangePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/changeprice")
public class ChangePriceController extends AbstractController<ChangePriceService, ChangePriceMapper, ChangePriceDTO, ChangePrice> {

    @Autowired
    ChangePriceService thisService;

    @Override
    public void initService() {
        service = thisService;
    }

    @Override
    public ChangePriceService getService() {
        initService();
        return service;
    }

    private ChangePriceMapper thisMapper;

    @Override
    public void initMapper() {
        mapper = thisMapper;
    }

    @Override
    public ChangePriceMapper getMapper() {
        initMapper(thisMapper.INSTANCE);
        return mapper;
    }

    @GetMapping("/get-all")
    public ResponseEntity<?> getAllChangePrice() {
        return getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCtpdById(@PathVariable Long id) {
        var entity = getService().findEntityById(id);
        var response = getMapper().toDto(entity, new CycleAvoidingMappingContext());
        return ResponseEntity.ok().body(new CustomResponse(200, "Get Change Price By Id " + id,
                response));
    }
}
