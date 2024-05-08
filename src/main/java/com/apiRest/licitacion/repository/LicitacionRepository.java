package com.apiRest.licitacion.repository;

import com.apiRest.licitacion.entities.Licitacion;

import org.springframework.data.repository.CrudRepository;

public interface LicitacionRepository extends CrudRepository<Licitacion,Integer> {
}
