package com.tamtvh.be.service.impl;

import com.tamtvh.be.dto.ProviderDTO;
import com.tamtvh.be.mapper.ProviderMapper;
import com.tamtvh.be.model.Provider;
import com.tamtvh.be.repository.ProviderRepository;
import com.tamtvh.be.service.ProviderService;
import com.tamtvh.be.service.helper.ServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ServiceHelper
public class ProviderServiceImpl extends AbstractServiceImpl<ProviderRepository, ProviderMapper, ProviderDTO, Provider>
        implements ProviderService {
    @Autowired
    ProviderRepository thisRepository;

    private ProviderMapper thisMapper;

    @Override
    public void initRepository() {
        repository = thisRepository;
    }

    @Override
    public void initMapper() {
        mapper = thisMapper;
    }

    @Override
    public ProviderRepository getRepository() {
        initRepository();
        return repository;
    }

    @Override
    public ProviderMapper getMapper() {
        initMapper(thisMapper.INSTANCE);
        return mapper;
    }
}
