package com.tamtvh.be.controller;

import com.tamtvh.be.dto.PromotionDTO;
import com.tamtvh.be.mapper.PromotionMapper;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.message.response.CustomResponse;
import com.tamtvh.be.model.Promotion;
import com.tamtvh.be.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/promotion")
public class PromotionController extends AbstractController<PromotionService, PromotionMapper, PromotionDTO, Promotion> {

    @Autowired
    PromotionService thisService;

    @Override
    public void initService() {
        service = thisService;
    }

    @Override
    public PromotionService getService() {
        initService();
        return service;
    }

    private PromotionMapper thisMapper;

    @Override
    public void initMapper() {
        mapper = thisMapper;
    }

    @Override
    public PromotionMapper getMapper() {
        initMapper(thisMapper.INSTANCE);
        return mapper;
    }

    @GetMapping("/get-all")
    public ResponseEntity<?> getAllPromo() {
        return getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getPromoById(@PathVariable Long id) {
        var entity = getService().findEntityById(id);
        var response = getMapper().toDto(entity, new CycleAvoidingMappingContext());
        return ResponseEntity.ok().body(new CustomResponse(200, "Get Promo By Id " + id,
                response));
    }
}
