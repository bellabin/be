package com.tamtvh.be.service.impl;

import com.tamtvh.be.dto.PromotionDTO;
import com.tamtvh.be.mapper.PromotionMapper;
import com.tamtvh.be.model.Promotion;
import com.tamtvh.be.repository.PromotionRepository;
import com.tamtvh.be.service.PromotionService;
import com.tamtvh.be.service.helper.ServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ServiceHelper
public class PromotionServiceImpl extends AbstractServiceImpl<PromotionRepository, PromotionMapper, PromotionDTO, Promotion>
        implements PromotionService {
    @Autowired
    PromotionRepository thisRepository;

    private PromotionMapper thisMapper;

    @Override
    public void initRepository() {
        repository = thisRepository;
    }

    @Override
    public void initMapper() {
        mapper = thisMapper;
    }

    @Override
    public PromotionRepository getRepository() {
        initRepository();
        return repository;
    }

    @Override
    public PromotionMapper getMapper() {
        initMapper(thisMapper.INSTANCE);
        return mapper;
    }
}
