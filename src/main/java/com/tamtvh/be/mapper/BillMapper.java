package com.tamtvh.be.mapper;

import com.tamtvh.be.dto.BillDTO;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.model.Bill;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BillMapper extends AbstractMapper<BillDTO, Bill>{
    BillMapper INSTANCE = Mappers.getMapper(BillMapper.class);

    @Mappings({

    })
    BillDTO toDtoWithoutLists(Bill entity, @Context CycleAvoidingMappingContext context);

    @Override
    default BillDTO toDto(Bill entity, @Context CycleAvoidingMappingContext context) {
        return toDtoWithoutLists(entity, context);
    }
}
