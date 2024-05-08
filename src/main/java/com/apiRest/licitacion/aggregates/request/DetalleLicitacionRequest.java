package com.apiRest.licitacion.aggregates.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetalleLicitacionRequest {
    private int idProveedor;
    private String fechaPropuesta;
}
