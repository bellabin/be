package com.tamtvh.be.dto;

import com.tamtvh.be.model.Role;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class StaffDTO {
    private String MANV;

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
}
