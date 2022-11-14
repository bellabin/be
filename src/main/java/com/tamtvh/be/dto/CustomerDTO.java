package com.tamtvh.be.dto;

import com.tamtvh.be.model.Role;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class CustomerDTO {
    private String MAKH;

    private String HO;

    private String TEN;

    private String GIOITINH;

    private Date NGAYSINH;

    private String DIACHI;

    private String SDT;

    private String EMAIL;

    private String USERNAME;

    private String PASSWORD;

    private String MANQ;

    private Role role;

    private List<PhieudatDTO> phieudats;
}
