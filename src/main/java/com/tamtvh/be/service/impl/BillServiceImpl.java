package com.tamtvh.be.service.impl;

import com.tamtvh.be.dto.BillDTO;
import com.tamtvh.be.mapper.BillMapper;
import com.tamtvh.be.model.Bill;
import com.tamtvh.be.repository.BillRepository;
import com.tamtvh.be.service.BillService;
import com.tamtvh.be.service.helper.ServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ServiceHelper
public class BillServiceImpl extends AbstractServiceImpl<BillRepository, BillMapper, BillDTO, Bill>
        implements BillService {
    @Autowired
    BillRepository thisRepository;

    private BillMapper thisMapper;

    @Override
    public void initRepository() {
        repository = thisRepository;
    }

    @Override
    public void initMapper() {
        mapper = thisMapper;
    }

    @Override
    public BillRepository getRepository() {
        initRepository();
        return repository;
    }

    @Override
    public BillMapper getMapper() {
        initMapper(thisMapper.INSTANCE);
        return mapper;
    }
}
