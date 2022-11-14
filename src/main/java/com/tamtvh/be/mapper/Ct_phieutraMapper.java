package com.tamtvh.be.mapper;

import com.tamtvh.be.dto.Ct_phieutraDTO;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.model.Ct_phieutra;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface Ct_phieutraMapper extends AbstractMapper<Ct_phieutraDTO, Ct_phieutra>{
    Ct_phieutraMapper INSTANCE = Mappers.getMapper(Ct_phieutraMapper.class);

    @Mappings({

    })
    Ct_phieutraDTO toDtoWithoutLists(Ct_phieutra entity, @Context CycleAvoidingMappingContext context);

    @Override
    default Ct_phieutraDTO toDto(Ct_phieutra entity, @Context CycleAvoidingMappingContext context) {
        return toDtoWithoutLists(entity, context);
    }
}
