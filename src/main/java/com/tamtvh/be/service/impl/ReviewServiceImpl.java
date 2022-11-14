package com.tamtvh.be.service.impl;

import com.tamtvh.be.dto.ProviderDTO;
import com.tamtvh.be.dto.ReviewDTO;
import com.tamtvh.be.mapper.ProviderMapper;
import com.tamtvh.be.mapper.ReviewMapper;
import com.tamtvh.be.model.Provider;
import com.tamtvh.be.model.Review;
import com.tamtvh.be.repository.ProviderRepository;
import com.tamtvh.be.repository.ReviewRepository;
import com.tamtvh.be.service.ProviderService;
import com.tamtvh.be.service.ReviewService;
import com.tamtvh.be.service.helper.ServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ServiceHelper
public class ReviewServiceImpl extends AbstractServiceImpl<ReviewRepository, ReviewMapper, ReviewDTO, Review>
        implements ReviewService {
    @Autowired
    ReviewRepository thisRepository;

    private ReviewMapper thisMapper;

    @Override
    public void initRepository() {
        repository = thisRepository;
    }

    @Override
    public void initMapper() {
        mapper = thisMapper;
    }

    @Override
    public ReviewRepository getRepository() {
        initRepository();
        return repository;
    }

    @Override
    public ReviewMapper getMapper() {
        initMapper(thisMapper.INSTANCE);
        return mapper;
    }
}
