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
public class PhieunhapDTO {
    private String MAPN;

    private Date NGAYLAP;

    private String MANV;

    private String MADDH;
}
