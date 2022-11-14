package com.tamtvh.be.mapper;

import com.tamtvh.be.dto.Ct_promotionDTO;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.model.Ct_promotion;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface Ct_promotionMapper extends AbstractMapper<Ct_promotionDTO, Ct_promotion>{
    Ct_promotionMapper INSTANCE = Mappers.getMapper(Ct_promotionMapper.class);

    @Mappings({

    })
    Ct_promotionDTO toDtoWithoutLists(Ct_promotion entity, @Context CycleAvoidingMappingContext context);

    @Override
    default Ct_promotionDTO toDto(Ct_promotion entity, @Context CycleAvoidingMappingContext context) {
        return toDtoWithoutLists(entity, context);
    }
}
