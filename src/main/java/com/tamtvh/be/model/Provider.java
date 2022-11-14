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
@Table(name="nhacungcap")
@ToString
@ApiModel(value = "All details about the roles.")
@Accessors(chain = true)
public class Provider {

    @Id
    @Column(name = "MANCC", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String MANCC;

    @NotBlank(message = "Provider name is required")
    @Column(name = "TENNCC", nullable = false)
    private String TENNCC;

    @NotBlank(message = "Address name is required")
    @Column(name = "DIACHI", nullable = false)
    private String DIACHI;

    @NotBlank(message = "Email name is required")
    @Column(name = "EMAIL", nullable = false)
    private String EMAIL;

    @NotBlank(message = "Phone number name is required")
    @Column(name = "SDT", nullable = false)
    private String SDT;


}
