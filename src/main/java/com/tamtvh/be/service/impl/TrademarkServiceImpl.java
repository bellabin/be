package com.tamtvh.be.service.impl;

import com.tamtvh.be.dto.TrademarkDTO;
import com.tamtvh.be.mapper.TrademarkMapper;
import com.tamtvh.be.model.Trademark;
import com.tamtvh.be.repository.TrademarkRepository;
import com.tamtvh.be.service.TrademarkService;
import com.tamtvh.be.service.helper.ServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ServiceHelper
public class TrademarkServiceImpl extends AbstractServiceImpl<TrademarkRepository, TrademarkMapper, TrademarkDTO, Trademark>
        implements TrademarkService {
    @Autowired
    TrademarkRepository thisRepository;

    private TrademarkMapper thisMapper;

    @Override
    public void initRepository() {
        repository = thisRepository;
    }

    @Override
    public void initMapper() {
        mapper = thisMapper;
    }

    @Override
    public TrademarkRepository getRepository() {
        initRepository();
        return repository;
    }

    @Override
    public TrademarkMapper getMapper() {
        initMapper(thisMapper.INSTANCE);
        return mapper;
    }
}
