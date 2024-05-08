package com.apiRest.licitacion.controller;

import com.apiRest.licitacion.aggregates.request.LicitacionRequest;
import com.apiRest.licitacion.services.LicitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping
public class LicitacionController {

    @Autowired
    private LicitacionService licitacionService;

//    @GetMapping("/listar_public")
//    public ResponseEntity<?> ListarTodo(){
//        Collection<Camara> camaras =camaraService.findAll();
//        if (camaras.isEmpty()){
//            new ResponseEntity<>("VACIO", HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<>(camaras,HttpStatus.OK);
//    }

    @PostMapping("/licitacion")
    public ResponseEntity<String> registrarLicitacion(@RequestBody LicitacionRequest licitacionRequest){
        try {
            licitacionService.registrarLicitacion(licitacionRequest);
            return ResponseEntity.status(HttpStatus.CREATED).body("Licitacion registrada exitosamente");
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al registrar licitación: "
                    +e.getMessage());
        }
    }


}
