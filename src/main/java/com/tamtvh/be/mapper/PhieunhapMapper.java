package com.tamtvh.be.mapper;

import com.tamtvh.be.dto.PhieudatDTO;
import com.tamtvh.be.dto.PhieunhapDTO;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.model.Phieudat;
import com.tamtvh.be.model.Phieunhap;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PhieunhapMapper extends AbstractMapper<PhieunhapDTO, Phieunhap>{
    PhieunhapMapper INSTANCE = Mappers.getMapper(PhieunhapMapper.class);

    @Mappings({

    })
    PhieunhapDTO toDtoWithoutLists(Phieunhap entity, @Context CycleAvoidingMappingContext context);

    @Override
    default PhieunhapDTO toDto(Phieunhap entity, @Context CycleAvoidingMappingContext context) {
        return toDtoWithoutLists(entity, context);
    }
}
