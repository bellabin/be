package com.tamtvh.be.mapper;

import com.tamtvh.be.dto.ReviewDTO;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.model.Review;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ReviewMapper extends AbstractMapper<ReviewDTO, Review>{
    ReviewMapper INSTANCE = Mappers.getMapper(ReviewMapper.class);

    @Mappings({

    })
    ReviewDTO toDtoWithoutLists(Review entity, @Context CycleAvoidingMappingContext context);

    @Override
    default ReviewDTO toDto(Review entity, @Context CycleAvoidingMappingContext context) {
        return toDtoWithoutLists(entity, context);
    }
}
