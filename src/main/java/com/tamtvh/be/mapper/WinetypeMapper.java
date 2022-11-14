package com.tamtvh.be.mapper;

import com.tamtvh.be.dto.StaffDTO;
import com.tamtvh.be.dto.WinetypeDTO;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.model.Staff;
import com.tamtvh.be.model.Winetype;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface WinetypeMapper extends AbstractMapper<WinetypeDTO, Winetype>{
    WinetypeMapper INSTANCE = Mappers.getMapper(WinetypeMapper.class);

    @Mappings({

    })
    WinetypeDTO toDtoWithoutLists(Winetype entity, @Context CycleAvoidingMappingContext context);

    @Override
    default WinetypeDTO toDto(Winetype entity, @Context CycleAvoidingMappingContext context) {
        return toDtoWithoutLists(entity, context);
    }
}
