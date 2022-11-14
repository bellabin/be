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
public class PhieutraDTO {
    private String MAPT;

    private Date NGAYTRA;

    private String MAHD;

    private String MANV;
}
