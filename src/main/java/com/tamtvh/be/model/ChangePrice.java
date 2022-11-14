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
@Table(name="thaydoigia")
@ToString
@ApiModel(value = "All details about the roles.")
@Accessors(chain = true)
public class ChangePrice {

    @Id
    @Column(name = "MADONG", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String MADONG;

    @NotBlank(message = "Change day is required")
    @Column(name = "NGAYTHAYDOI", nullable = false)
    private Date NGAYTHAYDOI;

    @NotBlank(message = "MANV is required")
    @Column(name = "MANV", nullable = false)
    private String MANV;

    @NotBlank(message = "Price is required")
    @Column(name = "GIA", nullable = false)
    private Float GIA;


}
