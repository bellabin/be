package com.tamtvh.be.controller;

import com.tamtvh.be.dto.BillDTO;
import com.tamtvh.be.dto.ChangePriceDTO;
import com.tamtvh.be.mapper.BillMapper;
import com.tamtvh.be.mapper.ChangePriceMapper;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.message.response.CustomResponse;
import com.tamtvh.be.model.Bill;
import com.tamtvh.be.model.ChangePrice;
import com.tamtvh.be.service.BillService;
import com.tamtvh.be.service.ChangePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/bill")
public class BillController extends AbstractController<BillService, BillMapper, BillDTO, Bill> {

    @Autowired
    BillService thisService;

    @Override
    public void initService() {
        service = thisService;
    }

    @Override
    public BillService getService() {
        initService();
        return service;
    }

    private BillMapper thisMapper;

    @Override
    public void initMapper() {
        mapper = thisMapper;
    }

    @Override
    public BillMapper getMapper() {
        initMapper(thisMapper.INSTANCE);
        return mapper;
    }

    @GetMapping("/get-all")
    public ResponseEntity<?> getAllBill() {
        return getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getBillById(@PathVariable Long id) {
        var entity = getService().findEntityById(id);
        var response = getMapper().toDto(entity, new CycleAvoidingMappingContext());
        return ResponseEntity.ok().body(new CustomResponse(200, "Get Bill By Id " + id,
                response));
    }
}
