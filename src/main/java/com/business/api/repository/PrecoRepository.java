package com.business.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.business.api.models.Preco;
import com.business.api.models.Produto;

public interface PrecoRepository extends CrudRepository<Preco, String>
{
    public Preco findByCodigoProduto(Produto codigoProduto);
}