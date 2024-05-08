package com.apiRest.licitacion.services;

import com.apiRest.licitacion.aggregates.request.LicitacionRequest;

public interface LicitacionService {


    void registrarLicitacion(LicitacionRequest licitacionRequest);

}
