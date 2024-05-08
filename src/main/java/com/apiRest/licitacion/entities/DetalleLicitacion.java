package com.apiRest.licitacion.entities;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "detalle_licitacion")
public class DetalleLicitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddetallelicitacion")
    private Integer idDetalleLicitacion;

    @Column(name = "fechapropuesta", length = 10, nullable = false)
    private String fechaPropuesta;

    @ManyToOne
    @JoinColumn(name = "idlicitacion", nullable = false)
    private Licitacion licitacion;

    @ManyToOne
    @JoinColumn(name = "idproveedor", nullable = false)
    private Proveedor proveedor;

}
