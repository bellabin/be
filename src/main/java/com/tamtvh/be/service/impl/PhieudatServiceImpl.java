package com.tamtvh.be.service.impl;

import com.tamtvh.be.dto.PhieudatDTO;
import com.tamtvh.be.mapper.PhieudatMapper;
import com.tamtvh.be.model.Phieudat;
import com.tamtvh.be.repository.PhieudatRepository;
import com.tamtvh.be.service.PhieudatService;
import com.tamtvh.be.service.helper.ServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ServiceHelper
public class PhieudatServiceImpl extends AbstractServiceImpl<PhieudatRepository, PhieudatMapper, PhieudatDTO, Phieudat>
        implements PhieudatService {
    @Autowired
    PhieudatRepository thisRepository;

    private PhieudatMapper thisMapper;

    @Override
    public void initRepository() {
        repository = thisRepository;
    }

    @Override
    public void initMapper() {
        mapper = thisMapper;
    }

    @Override
    public PhieudatRepository getRepository() {
        initRepository();
        return repository;
    }

    @Override
    public PhieudatMapper getMapper() {
        initMapper(thisMapper.INSTANCE);
        return mapper;
    }
}
