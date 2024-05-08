package com.apiRest.licitacion.aggregates.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class LicitacionRequest {
    private int idEmpresa;
    private String fecha;
    private List<DetalleLicitacionRequest> detallesLicitacion;
}
