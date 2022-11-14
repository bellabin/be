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
@Table(name="danhgia")
@ToString
@ApiModel(value = "All details about the reviews.")
@Accessors(chain = true)
public class Review {

    @Id
    @Column(name = "MAKH", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String MAKH;

    @NotBlank(message = "Wineline id is required")
    @Column(name = "MADONG", nullable = false)
    private String MADONG;

    @NotBlank(message = "LName is required")
    @Column(name = "NGAYDANHGIA", nullable = false)
    private Date NGAYDANHGIA;

    @NotBlank(message = "Rv is required")
    @Column(name = "NOIDUNG", nullable = false)
    private String NOIDUNG;

    @NotBlank(message = "Rating is required")
    @Column(name = "RATING", nullable = false)
    private Integer RATING;


}
