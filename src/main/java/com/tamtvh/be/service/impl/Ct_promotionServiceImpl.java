package com.tamtvh.be.service.impl;

import com.tamtvh.be.dto.Ct_promotionDTO;
import com.tamtvh.be.mapper.Ct_promotionMapper;
import com.tamtvh.be.model.Ct_promotion;
import com.tamtvh.be.repository.Ct_promotionRepository;
import com.tamtvh.be.service.Ct_promotionService;
import com.tamtvh.be.service.helper.ServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ServiceHelper
public class Ct_promotionServiceImpl extends AbstractServiceImpl<Ct_promotionRepository, Ct_promotionMapper, Ct_promotionDTO, Ct_promotion>
        implements Ct_promotionService {
    @Autowired
    Ct_promotionRepository thisRepository;

    private Ct_promotionMapper thisMapper;

    @Override
    public void initRepository() {
        repository = thisRepository;
    }

    @Override
    public void initMapper() {
        mapper = thisMapper;
    }

    @Override
    public Ct_promotionRepository getRepository() {
        initRepository();
        return repository;
    }

    @Override
    public Ct_promotionMapper getMapper() {
        initMapper(thisMapper.INSTANCE);
        return mapper;
    }
}
