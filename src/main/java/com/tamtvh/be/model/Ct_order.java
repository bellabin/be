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
@Table(name="ct_dondathang")
@ToString
@ApiModel(value = "All details about the users.")
@Accessors(chain = true)
public class Ct_order {

    @Id
    @Column(name = "MADONG", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String MADONG;

    @NotBlank(message = "FName is required")
    @Column(name = "MADDH", nullable = false)
    private String MADDH;

    @NotBlank(message = "Quantity is required")
    @Column(name = "SOLUONG", nullable = false)
    private Integer SOLUONG;

    @NotBlank(message = "Price is required")
    @Column(name = "GIA", nullable = false)
    private Float GIA;


}
