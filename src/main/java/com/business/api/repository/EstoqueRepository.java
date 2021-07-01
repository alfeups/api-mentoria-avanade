package com.business.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.business.api.models.Estoque;
import com.business.api.models.Loja;
import com.business.api.models.Produto;

public interface EstoqueRepository extends CrudRepository<Estoque, String>
{
    public Estoque findByCodigoFilialAndCodigoProduto(Loja codigoFilial, Produto codigoProduto);
}