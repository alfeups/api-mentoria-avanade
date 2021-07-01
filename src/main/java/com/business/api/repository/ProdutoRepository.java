package com.business.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.business.api.models.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, String>
{
    public Produto findByCodigo(Integer codigo);
}