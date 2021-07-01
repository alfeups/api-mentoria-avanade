package com.business.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.business.api.models.Loja;

public interface LojaRepository extends CrudRepository<Loja, String>
{
    public Loja findByCodigo(Integer codigo);
}