package com.tamtvh.be.controller;

import com.tamtvh.be.dto.Ct_promotionDTO;
import com.tamtvh.be.mapper.Ct_promotionMapper;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.message.response.CustomResponse;
import com.tamtvh.be.model.Ct_promotion;
import com.tamtvh.be.service.Ct_promotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/ct-promotion")
public class Ct_promotionController extends AbstractController<Ct_promotionService, Ct_promotionMapper, Ct_promotionDTO, Ct_promotion> {

    @Autowired
    Ct_promotionService thisService;

    @Override
    public void initService() {
        service = thisService;
    }

    @Override
    public Ct_promotionService getService() {
        initService();
        return service;
    }

    private Ct_promotionMapper thisMapper;

    @Override
    public void initMapper() {
        mapper = thisMapper;
    }

    @Override
    public Ct_promotionMapper getMapper() {
        initMapper(thisMapper.INSTANCE);
        return mapper;
    }

    @GetMapping("/get-all")
    public ResponseEntity<?> getAllCtpromo() {
        return getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCtpromoById(@PathVariable Long id) {
        var entity = getService().findEntityById(id);
        var response = getMapper().toDto(entity, new CycleAvoidingMappingContext());
        return ResponseEntity.ok().body(new CustomResponse(200, "Get Ctpromo By Id " + id,
                response));
    }
}
