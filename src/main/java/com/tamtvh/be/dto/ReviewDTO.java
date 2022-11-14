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
public class ReviewDTO {
    private String MAKH;

    private String MADONG;

    private Date NGAYDANHGIA;

    private String NOIDUNG;

    private Integer RATING;

}
