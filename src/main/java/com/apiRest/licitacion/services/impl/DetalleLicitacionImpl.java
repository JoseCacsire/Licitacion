package com.apiRest.licitacion.services.impl;

import com.apiRest.licitacion.repository.DetalleLicitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleLicitacionImpl {

    @Autowired
    private DetalleLicitacionRepository detalleLicitacionRepository;

}
