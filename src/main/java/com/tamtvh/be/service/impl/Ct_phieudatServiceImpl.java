package com.tamtvh.be.service.impl;

import com.tamtvh.be.dto.Ct_phieudatDTO;
import com.tamtvh.be.mapper.Ct_phieudatMapper;
import com.tamtvh.be.model.Ct_phieudat;
import com.tamtvh.be.repository.Ct_phieudatRepository;
import com.tamtvh.be.service.Ct_phieudatService;
import com.tamtvh.be.service.helper.ServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ServiceHelper
public class Ct_phieudatServiceImpl extends AbstractServiceImpl<Ct_phieudatRepository, Ct_phieudatMapper, Ct_phieudatDTO, Ct_phieudat>
        implements Ct_phieudatService {
    @Autowired
    Ct_phieudatRepository thisRepository;

    private Ct_phieudatMapper thisMapper;

    @Override
    public void initRepository() {
        repository = thisRepository;
    }

    @Override
    public void initMapper() {
        mapper = thisMapper;
    }

    @Override
    public Ct_phieudatRepository getRepository() {
        initRepository();
        return repository;
    }

    @Override
    public Ct_phieudatMapper getMapper() {
        initMapper(thisMapper.INSTANCE);
        return mapper;
    }
}
