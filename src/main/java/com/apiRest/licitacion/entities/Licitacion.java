package com.apiRest.licitacion.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "licitacion")
public class Licitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idlicitacion")
    private Integer idLicitacion;

    @Column(name = "fechalicitacion", length = 10, nullable = false)
    private String fechaLicitacion;

    @ManyToOne
    @JoinColumn(name = "idempresa", nullable = false)
    private Empresa empresa;


    @JsonIgnore//siempre pon esto,para q no te cree un bucle infinito
    @OneToMany(mappedBy = "licitacion", cascade = CascadeType.ALL)
    private List<DetalleLicitacion> detallesLicitacion;

}
