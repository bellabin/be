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
@Table(name="phieudat")
@ToString
@ApiModel(value = "All details about the pds.")
@Accessors(chain = true)
public class Phieudat {

    @Id
    @Column(name = "MAPD", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String MAPD;

    @NotBlank(message = "Date is required")
    @Column(name = "NGAYDAT", nullable = false)
    private Date NGAYDAT;

    @NotBlank(message = "Fname is required")
    @Column(name = "HONN", nullable = false)
    private String HONN;

    @NotBlank(message = "Lname is required")
    @Column(name = "TENNN", nullable = false)
    private String TENNN;

    @NotBlank(message = "Adress is required")
    @Column(name = "DIACHINN", nullable = false)
    private String DIACHINN;

    @NotBlank(message = "Phone is required")
    @Column(name = "SDTNN", nullable = false)
    private String SDTNN;

    @NotBlank(message = "Note number is required")
    @Column(name = "GHICHU", nullable = false)
    private String GHICHU;

    @NotBlank(message = "State is required")
    @Column(name = "TRANGTHAI", nullable = false)
    private String TRANGTHAI;

    @NotBlank(message = "Staff id is required")
    @Column(name = "MANVD", nullable = false)
    private String MANV;

    @NotBlank(message = "Shipper id is required")
    @Column(name = "MANVGH", nullable = false)
    private String MANVGH;

//    @NotBlank(message = "Customer id is required")
//    @Column(name = "MAKH", nullable = false)
//    private String MAKH;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "MAKH")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Customer customer;
}
