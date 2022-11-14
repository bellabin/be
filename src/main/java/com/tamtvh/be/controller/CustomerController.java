package com.tamtvh.be.controller;

import com.tamtvh.be.dto.CustomerDTO;
import com.tamtvh.be.mapper.CustomerMapper;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.message.response.CustomResponse;
import com.tamtvh.be.model.Customer;
import com.tamtvh.be.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/customer")
public class CustomerController extends AbstractController<CustomerService, CustomerMapper, CustomerDTO, Customer> {

    @Autowired
    CustomerService thisService;

    @Override
    public void initService() {
        service = thisService;
    }

    @Override
    public CustomerService getService() {
        initService();
        return service;
    }

    private CustomerMapper thisMapper;

    @Override
    public void initMapper() {
        mapper = thisMapper;
    }

    @Override
    public CustomerMapper getMapper() {
        initMapper(thisMapper.INSTANCE);
        return mapper;
    }

    @GetMapping("/get-all")
    public ResponseEntity<?> getAllUser() {
        return getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id) {
        var entity = getService().findEntityById(id);
        var response = getMapper().toDto(entity, new CycleAvoidingMappingContext());
        return ResponseEntity.ok().body(new CustomResponse(200, "Get User By Id " + id,
                response));
    }
}
