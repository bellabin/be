package com.tamtvh.be.dto;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class PhieudatDTO {
    private String MAPD;

    private Date NGAYDAT;

    private String HONN;

    private String TENNN;

    private String DIACHINN;

    private String SDTNN;

    private String GHICHU;

    private String TRANGTHAI;

    private String MANVD;

    private String MANVGH;

    private String MAKH;

    private CustomerDTO customer;
}
