package com.apiRest.licitacion.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idempresa")
    private Integer idEmpresa;

    @Column(name = "razonsocial", length = 100, nullable = false)
    private String razonSocial;

    @Column(name = "direccion", length = 100, nullable = false)
    private String direccion;

}
