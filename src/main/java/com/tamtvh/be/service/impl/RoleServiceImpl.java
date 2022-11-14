package com.tamtvh.be.service.impl;

import com.tamtvh.be.dto.RoleDTO;
import com.tamtvh.be.mapper.RoleMapper;
import com.tamtvh.be.model.Role;
import com.tamtvh.be.repository.RoleRepository;
import com.tamtvh.be.service.RoleService;
import com.tamtvh.be.service.helper.ServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ServiceHelper
public class RoleServiceImpl extends AbstractServiceImpl<RoleRepository, RoleMapper, RoleDTO, Role>
        implements RoleService {
    @Autowired
    RoleRepository thisRepository;

    private RoleMapper thisMapper;

    @Override
    public void initRepository() {
        repository = thisRepository;
    }

    @Override
    public void initMapper() {
        mapper = thisMapper;
    }

    @Override
    public RoleRepository getRepository() {
        initRepository();
        return repository;
    }

    @Override
    public RoleMapper getMapper() {
        initMapper(thisMapper.INSTANCE);
        return mapper;
    }
}
