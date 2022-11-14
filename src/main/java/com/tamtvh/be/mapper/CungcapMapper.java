package com.tamtvh.be.mapper;

import com.tamtvh.be.dto.CungcapDTO;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.model.Cungcap;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CungcapMapper extends AbstractMapper<CungcapDTO, Cungcap>{
    CungcapMapper INSTANCE = Mappers.getMapper(CungcapMapper.class);

    @Mappings({

    })
    CungcapDTO toDtoWithoutLists(Cungcap entity, @Context CycleAvoidingMappingContext context);

    @Override
    default CungcapDTO toDto(Cungcap entity, @Context CycleAvoidingMappingContext context) {
        return toDtoWithoutLists(entity, context);
    }
}
