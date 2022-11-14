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
@Table(name="dondathang")
@ToString
@ApiModel(value = "All details about the users.")
@Accessors(chain = true)
public class Order {

    @Id
    @Column(name = "MADDH", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String MADDH;

    @NotBlank(message = "Order date is required")
    @Column(name = "NGAYDAT", nullable = false)
    private Date NGAYDAT;

    @NotBlank(message = "Staff id is required")
    @Column(name = "MANV", nullable = false)
    private String MANV;

    @NotBlank(message = "Provider id is required")
    @Column(name = "MANCC", nullable = false)
    private String MANCC;


}
