package com.tamtvh.be.mapper;

import com.tamtvh.be.dto.OrderDTO;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.model.Order;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderMapper extends AbstractMapper<OrderDTO, Order>{
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    @Mappings({

    })
    OrderDTO toDtoWithoutLists(Order entity, @Context CycleAvoidingMappingContext context);

    @Override
    default OrderDTO toDto(Order entity, @Context CycleAvoidingMappingContext context) {
        return toDtoWithoutLists(entity, context);
    }
}
