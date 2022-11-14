package com.tamtvh.be.service.impl;

import com.tamtvh.be.dto.ChangePriceDTO;
import com.tamtvh.be.mapper.ChangePriceMapper;
import com.tamtvh.be.model.ChangePrice;
import com.tamtvh.be.repository.ChangePriceRepository;
import com.tamtvh.be.service.ChangePriceService;
import com.tamtvh.be.service.helper.ServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ServiceHelper
public class ChangePriceServiceImpl extends AbstractServiceImpl<ChangePriceRepository, ChangePriceMapper, ChangePriceDTO, ChangePrice>
        implements ChangePriceService {
    @Autowired
    ChangePriceRepository thisRepository;

    private ChangePriceMapper thisMapper;

    @Override
    public void initRepository() {
        repository = thisRepository;
    }

    @Override
    public void initMapper() {
        mapper = thisMapper;
    }

    @Override
    public ChangePriceRepository getRepository() {
        initRepository();
        return repository;
    }

    @Override
    public ChangePriceMapper getMapper() {
        initMapper(thisMapper.INSTANCE);
        return mapper;
    }
}
