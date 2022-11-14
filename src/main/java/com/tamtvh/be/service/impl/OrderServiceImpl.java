package com.tamtvh.be.service.impl;

import com.tamtvh.be.dto.OrderDTO;
import com.tamtvh.be.mapper.OrderMapper;
import com.tamtvh.be.model.Order;
import com.tamtvh.be.repository.OrderRepository;
import com.tamtvh.be.service.OrderService;
import com.tamtvh.be.service.helper.ServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ServiceHelper
public class OrderServiceImpl extends AbstractServiceImpl<OrderRepository, OrderMapper, OrderDTO, Order>
        implements OrderService {
    @Autowired
    OrderRepository thisRepository;

    private OrderMapper thisMapper;

    @Override
    public void initRepository() {
        repository = thisRepository;
    }

    @Override
    public void initMapper() {
        mapper = thisMapper;
    }

    @Override
    public OrderRepository getRepository() {
        initRepository();
        return repository;
    }

    @Override
    public OrderMapper getMapper() {
        initMapper(thisMapper.INSTANCE);
        return mapper;
    }
}
