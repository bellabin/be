package com.tamtvh.be.mapper;

import com.tamtvh.be.dto.WinelineDTO;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.model.Wineline;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface WinelineMapper extends AbstractMapper<WinelineDTO, Wineline>{
    WinelineMapper INSTANCE = Mappers.getMapper(WinelineMapper.class);

    @Mappings({

    })
    WinelineDTO toDtoWithoutLists(Wineline entity, @Context CycleAvoidingMappingContext context);

    @Override
    default WinelineDTO toDto(Wineline entity, @Context CycleAvoidingMappingContext context) {
        return toDtoWithoutLists(entity, context);
    }
}
