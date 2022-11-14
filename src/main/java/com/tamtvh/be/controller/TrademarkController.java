package com.tamtvh.be.controller;


import com.tamtvh.be.dto.TrademarkDTO;
import com.tamtvh.be.mapper.TrademarkMapper;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.message.response.CustomResponse;
import com.tamtvh.be.model.Trademark;
import com.tamtvh.be.service.TrademarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/trademark")
public class TrademarkController extends AbstractController<TrademarkService, TrademarkMapper, TrademarkDTO, Trademark> {

    @Autowired
    TrademarkService thisService;

    @Override
    public void initService() {
        service = thisService;
    }

    @Override
    public TrademarkService getService() {
        initService();
        return service;
    }

    private TrademarkMapper thisMapper;

    @Override
    public void initMapper() {
        mapper = thisMapper;
    }

    @Override
    public TrademarkMapper getMapper() {
        initMapper(thisMapper.INSTANCE);
        return mapper;
    }

    @GetMapping("/get-all")
    public ResponseEntity<?> getAllTrademark() {
        return getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getTrademarkById(@PathVariable Long id) {
        var entity = getService().findEntityById(id);
        var response = getMapper().toDto(entity, new CycleAvoidingMappingContext());
        return ResponseEntity.ok().body(new CustomResponse(200, "Get Trademark By Id " + id,
                response));
    }
}
