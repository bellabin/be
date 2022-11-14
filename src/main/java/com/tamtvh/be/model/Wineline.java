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
@Table(name="dongruou")
@ToString
@ApiModel(value = "All details about the winelines.")
@Accessors(chain = true)
public class Wineline {

    @Id
    @Column(name = "MADONG", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String MADONG;

    @Column(name = "TENDONG", nullable = false)
    private String TENDONG;

    @Column(name = "TRANGTHAI")
    private String TRANGTHAI;

    @Column(name = "HINHANH", nullable = false)
    private String HINHANH;

    @Column(name = "MOTA", nullable = false)
    private String  MOTA;

    @Column(name = "CHITIET")
    private String CHITIET;

    @Column(name = "SOLUONGTON")
    private Integer SOLUONGTON;

    @Column(name = "MALOAI", nullable = false)
    private String MALOAI;

    @Column(name = "MATH", nullable = false)
    private String MATH;

}
