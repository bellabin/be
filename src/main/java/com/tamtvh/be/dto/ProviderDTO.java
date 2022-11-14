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
public class ProviderDTO {
    private String MANCC;

    private String TENNCC;

    private String DIACHI;

    private String EMAIL;

    private String SDT;

}
