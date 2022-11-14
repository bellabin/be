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
public class Ct_phieunhapDTO {
    private String MAPN;

    private String MADONG;

    private Integer SOLUONG;

    private Float GIA;

}
