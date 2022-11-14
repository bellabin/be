package com.tamtvh.be.mapper;

import com.tamtvh.be.dto.PromotionDTO;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.model.Promotion;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PromotionMapper extends AbstractMapper<PromotionDTO, Promotion>{
    PromotionMapper INSTANCE = Mappers.getMapper(PromotionMapper.class);

    @Mappings({

    })
    PromotionDTO toDtoWithoutLists(Promotion entity, @Context CycleAvoidingMappingContext context);

    @Override
    default PromotionDTO toDto(Promotion entity, @Context CycleAvoidingMappingContext context) {
        return toDtoWithoutLists(entity, context);
    }
}
