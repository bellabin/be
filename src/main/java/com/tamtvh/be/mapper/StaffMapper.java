package com.tamtvh.be.mapper;

import com.tamtvh.be.dto.StaffDTO;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.model.Staff;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StaffMapper extends AbstractMapper<StaffDTO, Staff>{
    StaffMapper INSTANCE = Mappers.getMapper(StaffMapper.class);

    @Mappings({
            @Mapping(source = "role2", target = "role"),
            @Mapping(target = "role.customers", ignore = true),
            @Mapping(target = "role.staffs", ignore = true),
            @Mapping(source = "role2.MANQ", target = "MANQ"),
    })
    StaffDTO toDtoWithoutLists(Staff entity, @Context CycleAvoidingMappingContext context);

    @Override
    default StaffDTO toDto(Staff entity, @Context CycleAvoidingMappingContext context) {
        return toDtoWithoutLists(entity, context);
    }
}
