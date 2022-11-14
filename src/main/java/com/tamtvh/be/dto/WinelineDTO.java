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
public class WinelineDTO {
    private String MADONG;

    private String TENDONG;

    private String TRANGTHAI;

    private String HINHANH;

    private String MOTA;

    private String CHITIET;

    private Integer SOLUONGTON;

    private String MALOAI;

    private String MATH;

}
