package com.tamtvh.be.mapper;

import com.tamtvh.be.dto.Ct_phieunhapDTO;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.model.Ct_phieunhap;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface Ct_phieunhapMapper extends AbstractMapper<Ct_phieunhapDTO, Ct_phieunhap>{
    Ct_phieunhapMapper INSTANCE = Mappers.getMapper(Ct_phieunhapMapper.class);

    @Mappings({

    })
    Ct_phieunhapDTO toDtoWithoutLists(Ct_phieunhap entity, @Context CycleAvoidingMappingContext context);

    @Override
    default Ct_phieunhapDTO toDto(Ct_phieunhap entity, @Context CycleAvoidingMappingContext context) {
        return toDtoWithoutLists(entity, context);
    }
}
