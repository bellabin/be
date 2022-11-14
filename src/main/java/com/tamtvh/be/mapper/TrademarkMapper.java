package com.tamtvh.be.mapper;

import com.tamtvh.be.dto.TrademarkDTO;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.model.Trademark;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TrademarkMapper extends AbstractMapper<TrademarkDTO, Trademark>{
    TrademarkMapper INSTANCE = Mappers.getMapper(TrademarkMapper.class);

    @Mappings({

    })
    TrademarkDTO toDtoWithoutLists(Trademark entity, @Context CycleAvoidingMappingContext context);

    @Override
    default TrademarkDTO toDto(Trademark entity, @Context CycleAvoidingMappingContext context) {
        return toDtoWithoutLists(entity, context);
    }
}
