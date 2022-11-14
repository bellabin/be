package com.tamtvh.be.model;

import io.swagger.annotations.ApiModel;
import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="ct_phieunhap")
@ToString
@ApiModel(value = "All details about the ct_pns.")
@Accessors(chain = true)
public class Ct_phieunhap {

    @Id
    @Column(name = "MAPN", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String MAPN;

    @NotBlank(message = "FName is required")
    @Column(name = "MADONG", nullable = false)
    private String MADONG;

    @NotBlank(message = "Quantity is required")
    @Column(name = "SOLUONG", nullable = false)
    private Integer SOLUONG;

    @NotBlank(message = "Price is required")
    @Column(name = "GIA", nullable = false)
    private Float GIA;


}
