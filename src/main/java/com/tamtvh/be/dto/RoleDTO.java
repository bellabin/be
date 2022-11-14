package com.tamtvh.be.dto;

import com.tamtvh.be.model.Customer;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.Collection;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class RoleDTO {
    private String MANQ;

    private String TENNQ;

    private Collection<CustomerDTO> customers;

    private Collection<StaffDTO> staffs;
}
