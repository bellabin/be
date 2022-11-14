package com.tamtvh.be.mapper;

import com.tamtvh.be.dto.ChangePriceDTO;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.model.ChangePrice;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ChangePriceMapper extends AbstractMapper<ChangePriceDTO, ChangePrice>{
    ChangePriceMapper INSTANCE = Mappers.getMapper(ChangePriceMapper.class);

    @Mappings({

    })
    ChangePriceDTO toDtoWithoutLists(ChangePrice entity, @Context CycleAvoidingMappingContext context);

    @Override
    default ChangePriceDTO toDto(ChangePrice entity, @Context CycleAvoidingMappingContext context) {
        return toDtoWithoutLists(entity, context);
    }
}
