package com.apiRest.licitacion.services.impl;

import com.apiRest.licitacion.aggregates.request.DetalleLicitacionRequest;
import com.apiRest.licitacion.aggregates.request.LicitacionRequest;
import com.apiRest.licitacion.entities.DetalleLicitacion;
import com.apiRest.licitacion.entities.Empresa;
import com.apiRest.licitacion.entities.Licitacion;
import com.apiRest.licitacion.entities.Proveedor;
import com.apiRest.licitacion.repository.DetalleLicitacionRepository;
import com.apiRest.licitacion.repository.LicitacionRepository;
import com.apiRest.licitacion.services.LicitacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
public class LicitacionServiceImpl implements LicitacionService {
    private final LicitacionRepository licitacionRepository;
    private final DetalleLicitacionRepository detalleLicitacionRepository;

    @Override
    @Transactional
    public void registrarLicitacion(LicitacionRequest licitacionRequest) {
        Licitacion licitacion = new Licitacion();
        licitacion.setEmpresa(getEmpresa(licitacionRequest));
        licitacion.setFechaLicitacion(licitacionRequest.getFecha());
        licitacionRepository.save(licitacion);
        for (DetalleLicitacionRequest detalleLicitacionRequest:licitacionRequest.getDetallesLicitacion()) {
            DetalleLicitacion detalleLicitacion = new DetalleLicitacion();
            detalleLicitacion.setLicitacion(licitacion);
            detalleLicitacion.setFechaPropuesta(detalleLicitacionRequest.getFechaPropuesta());
            detalleLicitacion.setProveedor(getProveedor(detalleLicitacionRequest));
            detalleLicitacionRepository.save(detalleLicitacion);
        }
    }

    private Empresa getEmpresa(LicitacionRequest licitacionRequest){
        Empresa empresa = new Empresa();
        empresa.setIdEmpresa(licitacionRequest.getIdEmpresa());
        return empresa;
    }
    private Proveedor getProveedor(DetalleLicitacionRequest detalleLicitacionRequest){
        Proveedor proveedor = new Proveedor();
        proveedor.setIdProveedor(detalleLicitacionRequest.getIdProveedor());
        return proveedor;
    }

}
