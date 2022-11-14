package com.tamtvh.be.mapper;

import com.tamtvh.be.dto.PhieudatDTO;
import com.tamtvh.be.dto.StaffDTO;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.model.Phieudat;
import com.tamtvh.be.model.Staff;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PhieudatMapper extends AbstractMapper<PhieudatDTO, Phieudat>{
    PhieudatMapper INSTANCE = Mappers.getMapper(PhieudatMapper.class);

    @Mappings({
            @Mapping(source = "customer", target = "customer"),
            @Mapping(source = "customer.MAKH", target = "MAKH"),
            @Mapping(source = "customer.role1.MANQ", target = "customer.MANQ"),
            @Mapping(target = "customer.phieudats", ignore = true),
    })
    PhieudatDTO toDtoWithoutLists(Phieudat entity, @Context CycleAvoidingMappingContext context);

    @Override
    default PhieudatDTO toDto(Phieudat entity, @Context CycleAvoidingMappingContext context) {
        return toDtoWithoutLists(entity, context);
    }
}
