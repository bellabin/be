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
@Table(name="cungcap")
@ToString
@ApiModel(value = "All details about the provide.")
@Accessors(chain = true)
public class Cungcap {

    @Id
    @Column(name = "MANCC", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String MANCC;

    @NotBlank(message = "FName is required")
    @Column(name = "MADONG", nullable = false)
    private String MADONG;

    @NotBlank(message = "Price is required")
    @Column(name = "GIA", nullable = false)
    private Float GIA;

}
