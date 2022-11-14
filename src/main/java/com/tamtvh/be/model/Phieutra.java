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
@Table(name="phieutra")
@ToString
@ApiModel(value = "All details about the pts.")
@Accessors(chain = true)
public class Phieutra {

    @Id
    @Column(name = "MAPT", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String MAPT;

    @NotBlank(message = "Date is required")
    @Column(name = "NGAYTRA", nullable = false)
    private Date NGAYTRA;

    @NotBlank(message = "Bill id is required")
    @Column(name = "MAHD", nullable = false)
    private String MAHD;

    @NotBlank(message = "Staff id is required")
    @Column(name = "MANV", nullable = false)
    private String MANV;


}
