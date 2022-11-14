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
@Table(name="loairuou")
@ToString
@ApiModel(value = "All details about the wine types.")
@Accessors(chain = true)
public class Winetype {

    @Id
    @Column(name = "MALOAI", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String MALOAI;

    @NotBlank(message = "Wine type name is required")
    @Column(name = "TENLOAI", nullable = false)
    private String TENLOAI;


}
