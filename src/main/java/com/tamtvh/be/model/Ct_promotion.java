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
@Table(name="ct_khuyenmai")
@ToString
@ApiModel(value = "All details about the ct_promo.")
@Accessors(chain = true)
public class Ct_promotion {

    @Id
    @Column(name = "MAKM", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String MAKM;

    @NotBlank(message = "FName is required")
    @Column(name = "MADONG", nullable = false)
    private String MADONG;

    @NotBlank(message = "Promo percent is required")
    @Column(name = "PHANTRAMGIAM", nullable = false)
    private Integer PHANTRAMGIAM;


}
