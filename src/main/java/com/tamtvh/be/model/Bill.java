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
@Table(name="hoadon")
@ToString
@ApiModel(value = "All details about the bills.")
@Accessors(chain = true)
public class Bill {

    @Id
    @Column(name = "MAHD", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String MAHD;

    @NotBlank(message = "Date is required")
    @Column(name = "NGAY", nullable = false)
    private Date NGAY;

    @NotBlank(message = "Total price is required")
    @Column(name = "THANHTIEN", nullable = false)
    private Float THANHTIEN;

    @NotBlank(message = "Tax num is required")
    @Column(name = "MASOTHUE", nullable = false)
    private String MASOTHUE;

    @NotBlank(message = "Staff id is required")
    @Column(name = "MANV", nullable = false)
    private String MANV;

    @NotBlank(message = "Pd id is required")
    @Column(name = "MAPD", nullable = false)
    private String MAPD;


}
