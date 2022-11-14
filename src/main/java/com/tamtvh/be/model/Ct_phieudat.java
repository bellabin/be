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
@Table(name="ct_phieudat")
@ToString
@ApiModel(value = "All details about the users.")
@Accessors(chain = true)
public class Ct_phieudat {

    @Id
    @Column(name = "IDCTPD", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IDCTPD;

    @NotBlank(message = "FName is required")
    @Column(name = "MAPD", nullable = false)
    private String MAPD;

    @NotBlank(message = "LName is required")
    @Column(name = "MADONG", nullable = false)
    private String MADONG;

    @NotBlank(message = "Quantity is required")
    @Column(name = "SOLUONG", nullable = false)
    private Integer SOLUONG;

    @NotBlank(message = "Price is required")
    @Column(name = "GIA", nullable = false)
    private Float GIA;


}
