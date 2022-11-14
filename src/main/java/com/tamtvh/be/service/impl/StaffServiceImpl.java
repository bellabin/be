package com.tamtvh.be.service.impl;

import com.tamtvh.be.dto.StaffDTO;
import com.tamtvh.be.mapper.StaffMapper;
import com.tamtvh.be.model.Staff;
import com.tamtvh.be.repository.StaffRepository;
import com.tamtvh.be.service.StaffService;
import com.tamtvh.be.service.helper.ServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ServiceHelper
public class StaffServiceImpl extends AbstractServiceImpl<StaffRepository, StaffMapper, StaffDTO, Staff>
        implements StaffService {
    @Autowired
    StaffRepository thisRepository;

    private StaffMapper thisMapper;

    @Override
    public void initRepository() {
        repository = thisRepository;
    }

    @Override
    public void initMapper() {
        mapper = thisMapper;
    }

    @Override
    public StaffRepository getRepository() {
        initRepository();
        return repository;
    }

    @Override
    public StaffMapper getMapper() {
        initMapper(thisMapper.INSTANCE);
        return mapper;
    }
}
