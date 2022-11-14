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
public class ChangePriceDTO {
    private String MADONG;

    private Date NGAYTHAYDOI;

    private String MANV;

    private Float GIA;

}
