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
public class Ct_orderDTO {
    private String MADONG;

    private String MADDH;

    private Integer SOLUONG;

    private Float GIA;

}
