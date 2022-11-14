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
@Table(name="ct_phieutra")
@ToString
@ApiModel(value = "All details about the ct_pts.")
@Accessors(chain = true)
public class Ct_phieutra {

    @Id
    @Column(name = "MAPT", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String MAPT;

    @NotBlank(message = "IDCTPD is required")
    @Column(name = "IDCTPD", nullable = false)
    private String IDCTPD;

    @NotBlank(message = "Quantity is required")
    @Column(name = "SOLUONG", nullable = false)
    private Integer SOLUONG;


}
