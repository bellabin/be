package com.tamtvh.be.service.impl;

import com.tamtvh.be.dto.CungcapDTO;
import com.tamtvh.be.mapper.CungcapMapper;
import com.tamtvh.be.model.Cungcap;
import com.tamtvh.be.repository.CungcapRepository;
import com.tamtvh.be.service.CungcapService;
import com.tamtvh.be.service.helper.ServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ServiceHelper
public class CungcapServiceImpl extends AbstractServiceImpl<CungcapRepository, CungcapMapper, CungcapDTO, Cungcap>
        implements CungcapService {
    @Autowired
    CungcapRepository thisRepository;

    private CungcapMapper thisMapper;

    @Override
    public void initRepository() {
        repository = thisRepository;
    }

    @Override
    public void initMapper() {
        mapper = thisMapper;
    }

    @Override
    public CungcapRepository getRepository() {
        initRepository();
        return repository;
    }

    @Override
    public CungcapMapper getMapper() {
        initMapper(thisMapper.INSTANCE);
        return mapper;
    }
}
