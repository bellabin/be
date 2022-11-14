package com.tamtvh.be.service.impl;

import com.tamtvh.be.dto.WinetypeDTO;
import com.tamtvh.be.mapper.WinetypeMapper;
import com.tamtvh.be.model.Winetype;
import com.tamtvh.be.repository.WinetypeRepository;
import com.tamtvh.be.service.WinetypeService;
import com.tamtvh.be.service.helper.ServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ServiceHelper
public class WinetypeServiceImpl extends AbstractServiceImpl<WinetypeRepository, WinetypeMapper, WinetypeDTO, Winetype>
        implements WinetypeService {
    @Autowired
    WinetypeRepository thisRepository;

    private WinetypeMapper thisMapper;

    @Override
    public void initRepository() {
        repository = thisRepository;
    }

    @Override
    public void initMapper() {
        mapper = thisMapper;
    }

    @Override
    public WinetypeRepository getRepository() {
        initRepository();
        return repository;
    }

    @Override
    public WinetypeMapper getMapper() {
        initMapper(thisMapper.INSTANCE);
        return mapper;
    }
}
