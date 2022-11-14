package com.tamtvh.be.mapper;

import com.tamtvh.be.dto.Ct_orderDTO;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.model.Ct_order;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface Ct_orderMapper extends AbstractMapper<Ct_orderDTO, Ct_order>{
    Ct_orderMapper INSTANCE = Mappers.getMapper(Ct_orderMapper.class);

    @Mappings({

    })
    Ct_orderDTO toDtoWithoutLists(Ct_order entity, @Context CycleAvoidingMappingContext context);

    @Override
    default Ct_orderDTO toDto(Ct_order entity, @Context CycleAvoidingMappingContext context) {
        return toDtoWithoutLists(entity, context);
    }
}
