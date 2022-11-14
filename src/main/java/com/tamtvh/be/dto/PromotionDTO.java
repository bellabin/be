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
public class PromotionDTO {
    private String MAKM;

    private String TENKM;

    private Date NGAYBATDAU;

    private Date NGAYKETTHUC;

    private String LIDO;

    private String MANV;

}
