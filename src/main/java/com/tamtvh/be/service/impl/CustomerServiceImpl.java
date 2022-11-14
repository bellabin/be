package com.tamtvh.be.service.impl;

import com.tamtvh.be.dto.CustomerDTO;
import com.tamtvh.be.mapper.CustomerMapper;
import com.tamtvh.be.model.Customer;
import com.tamtvh.be.repository.CustomerRepository;
import com.tamtvh.be.service.CustomerService;
import com.tamtvh.be.service.helper.ServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ServiceHelper
public class CustomerServiceImpl extends AbstractServiceImpl<CustomerRepository, CustomerMapper, CustomerDTO, Customer>
        implements CustomerService {
    @Autowired
    CustomerRepository thisRepository;

    private CustomerMapper thisMapper;

    @Override
    public void initRepository() {
        repository = thisRepository;
    }

    @Override
    public void initMapper() {
        mapper = thisMapper;
    }

    @Override
    public CustomerRepository getRepository() {
        initRepository();
        return repository;
    }

    @Override
    public CustomerMapper getMapper() {
        initMapper(thisMapper.INSTANCE);
        return mapper;
    }
}
