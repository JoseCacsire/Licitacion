package com.apiRest.licitacion.services;


import com.apiRest.licitacion.aggregates.request.DetalleLicitacionRequest;
import com.apiRest.licitacion.aggregates.request.LicitacionRequest;

public interface DetalleLicitacionService {

    void registrarDetalle(DetalleLicitacionRequest detalleLicitacionRequest);

}
