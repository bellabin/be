package com.tamtvh.be.controller;

import com.tamtvh.be.dto.WinelineDTO;
import com.tamtvh.be.mapper.WinelineMapper;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.message.response.CustomResponse;
import com.tamtvh.be.model.Wineline;
import com.tamtvh.be.service.WinelineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/wineline")
public class WinelineController extends AbstractController<WinelineService, WinelineMapper, WinelineDTO, Wineline> {

    @Autowired
    WinelineService thisService;

    @Override
    public void initService() {
        service = thisService;
    }

    @Override
    public WinelineService getService() {
        initService();
        return service;
    }

    private WinelineMapper thisMapper;

    @Override
    public void initMapper() {
        mapper = thisMapper;
    }

    @Override
    public WinelineMapper getMapper() {
        initMapper(thisMapper.INSTANCE);
        return mapper;
    }

    @GetMapping("/get-all")
    public ResponseEntity<?> getAllWineline() {
        return getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getWinelineById(@PathVariable Long id) {
        var entity = getService().findEntityById(id);
        var response = getMapper().toDto(entity, new CycleAvoidingMappingContext());
        return ResponseEntity.ok().body(new CustomResponse(200, "Get Wineline By Id " + id,
                response));
    }
}
