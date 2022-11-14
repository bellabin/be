package com.tamtvh.be.mapper;

import com.tamtvh.be.dto.PhieutraDTO;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.model.Phieutra;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PhieutraMapper extends AbstractMapper<PhieutraDTO, Phieutra>{
    PhieutraMapper INSTANCE = Mappers.getMapper(PhieutraMapper.class);

    @Mappings({

    })
    PhieutraDTO toDtoWithoutLists(Phieutra entity, @Context CycleAvoidingMappingContext context);

    @Override
    default PhieutraDTO toDto(Phieutra entity, @Context CycleAvoidingMappingContext context) {
        return toDtoWithoutLists(entity, context);
    }
}
