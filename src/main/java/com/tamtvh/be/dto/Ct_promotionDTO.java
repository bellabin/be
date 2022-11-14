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
public class Ct_promotionDTO {
    private String MAKM;

    private String MADONG;

    private Integer PHANTRAMGIAM;

}
