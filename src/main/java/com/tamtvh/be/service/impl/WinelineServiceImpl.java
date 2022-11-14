package com.tamtvh.be.service.impl;

import com.tamtvh.be.dto.StaffDTO;
import com.tamtvh.be.dto.WinelineDTO;
import com.tamtvh.be.mapper.StaffMapper;
import com.tamtvh.be.mapper.WinelineMapper;
import com.tamtvh.be.model.Staff;
import com.tamtvh.be.model.Wineline;
import com.tamtvh.be.repository.StaffRepository;
import com.tamtvh.be.repository.WinelineRepository;
import com.tamtvh.be.service.StaffService;
import com.tamtvh.be.service.WinelineService;
import com.tamtvh.be.service.helper.ServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ServiceHelper
public class WinelineServiceImpl extends AbstractServiceImpl<WinelineRepository, WinelineMapper, WinelineDTO, Wineline>
        implements WinelineService {
    @Autowired
    WinelineRepository thisRepository;

    private WinelineMapper thisMapper;

    @Override
    public void initRepository() {
        repository = thisRepository;
    }

    @Override
    public void initMapper() {
        mapper = thisMapper;
    }

    @Override
    public WinelineRepository getRepository() {
        initRepository();
        return repository;
    }

    @Override
    public WinelineMapper getMapper() {
        initMapper(thisMapper.INSTANCE);
        return mapper;
    }
}
