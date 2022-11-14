package com.tamtvh.be.mapper;

import com.tamtvh.be.dto.Ct_phieudatDTO;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.model.Ct_phieudat;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface Ct_phieudatMapper extends AbstractMapper<Ct_phieudatDTO, Ct_phieudat>{
    Ct_phieudatMapper INSTANCE = Mappers.getMapper(Ct_phieudatMapper.class);

    @Mappings({

    })
    Ct_phieudatDTO toDtoWithoutLists(Ct_phieudat entity, @Context CycleAvoidingMappingContext context);

    @Override
    default Ct_phieudatDTO toDto(Ct_phieudat entity, @Context CycleAvoidingMappingContext context) {
        return toDtoWithoutLists(entity, context);
    }
}
