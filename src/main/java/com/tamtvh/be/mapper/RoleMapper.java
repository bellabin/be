package com.tamtvh.be.mapper;

import com.tamtvh.be.dto.RoleDTO;
import com.tamtvh.be.dto.StaffDTO;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.model.Role;
import com.tamtvh.be.model.Staff;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoleMapper extends AbstractMapper<RoleDTO, Role>{
    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);

    @Mappings({
            @Mapping(source = "customers", target = "customers"),
            @Mapping(source = "staffs", target = "staffs"),
//            @Mapping(target = "customers", ignore = true),
    })
    RoleDTO toDtoWithoutLists(Role entity, @Context CycleAvoidingMappingContext context);

    @Override
    default RoleDTO toDto(Role entity, @Context CycleAvoidingMappingContext context) {
        return toDtoWithoutLists(entity, context);
    }
}
