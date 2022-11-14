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
public class Ct_phieudatDTO {
    private Integer IDCTPD;

    private String MAPD;

    private String MADONG;

    private Integer SOLUONG;

    private Float GIA;

}
