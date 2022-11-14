package com.tamtvh.be.mapper;

import com.tamtvh.be.dto.CustomerDTO;
import com.tamtvh.be.dto.PhieudatDTO;
import com.tamtvh.be.mapper.helper.CycleAvoidingMappingContext;
import com.tamtvh.be.model.Customer;
import com.tamtvh.be.model.Phieudat;
import jdk.jfr.Name;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerMapper extends AbstractMapper<CustomerDTO, Customer>{
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    @Mappings({
            @Mapping(source = "phieudats", target = "phieudats", qualifiedByName = "toLazyListPhieuDatDTO"),
            @Mapping(target = "phieudats[].customer", ignore = true),
            @Mapping(source = "role1", target = "role"),
            @Mapping(target = "role.customers", ignore = true),
            @Mapping(target = "role.staffs", ignore = true),
            @Mapping(source = "role1.MANQ", target = "MANQ"),
    })
    CustomerDTO toDtoWithoutLists(Customer entity, @Context CycleAvoidingMappingContext context);

    @Override
    default CustomerDTO toDto(Customer entity, @Context CycleAvoidingMappingContext context) {
        return toDtoWithoutLists(entity, context);
    }

    @Named("toLazyListPhieuDatDTO")
    default List<PhieudatDTO> toLazyListPhieuDatDTO(Collection<Phieudat> collection) {
        if (collection == null) {
            return null;
        }
        List<PhieudatDTO> target = new ArrayList<PhieudatDTO>(collection.size());
        for (Phieudat phieudat : collection) {
            target.add(PhieudatMapper.INSTANCE.toDto(phieudat, new CycleAvoidingMappingContext()));
        }
        return target;
    }
}
