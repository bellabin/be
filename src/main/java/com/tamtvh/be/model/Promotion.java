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
@Table(name="khuyenmai")
@ToString
@ApiModel(value = "All details about the users.")
@Accessors(chain = true)
public class Promotion {

    @Id
    @Column(name = "MAKM", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String MAKM;

    @NotBlank(message = "Promo name is required")
    @Column(name = "TENKM", nullable = false)
    private String TENKM;

    @NotBlank(message = "Date start is required")
    @Column(name = "NGAYBATDAU", nullable = false)
    private Date NGAYBATDAU;

    @NotBlank(message = "Date end is required")
    @Column(name = "NGAYKETTHUC", nullable = false)
    private Date NGAYKETTHUC;

    @NotBlank(message = "Reason is required")
    @Column(name = "LIDO", nullable = false)
    private String  LIDO;

    @NotBlank(message = "Staff id is required")
    @Column(name = "MANV", nullable = false)
    private String MANV;


}
