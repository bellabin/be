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
public class BillDTO {
    private String MAHD;

    private Date NGAY;

    private Float THANHTIEN;

    private String MASOTHUE;

    private String MANV;

    private String MAPD;

}
