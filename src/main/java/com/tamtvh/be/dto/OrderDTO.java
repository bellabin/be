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
public class OrderDTO {
    private String MADDH;

    private Date NGAYDAT;

    private String MANV;

    private String MANCC;
}
