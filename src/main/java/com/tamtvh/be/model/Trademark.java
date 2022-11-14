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
@Table(name="thuonghieu")
@ToString
@ApiModel(value = "All details about the brands.")
@Accessors(chain = true)
public class Trademark {

    @Id
    @Column(name = "MATH", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String MATH;

    @NotBlank(message = "Brand name is required")
    @Column(name = "TENTH", nullable = false)
    private String TENTH;

}
