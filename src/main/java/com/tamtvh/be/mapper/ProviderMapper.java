package com.tamtvh.be.mapper;

import com.tamtvh.be.dto.ProviderDTO;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.model.Provider;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProviderMapper extends AbstractMapper<ProviderDTO, Provider>{
    ProviderMapper INSTANCE = Mappers.getMapper(ProviderMapper.class);

    @Mappings({

    })
    ProviderDTO toDtoWithoutLists(Provider entity, @Context CycleAvoidingMappingContext context);

    @Override
    default ProviderDTO toDto(Provider entity, @Context CycleAvoidingMappingContext context) {
        return toDtoWithoutLists(entity, context);
    }
}
