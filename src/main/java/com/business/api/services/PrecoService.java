package com.business.api.services;

import com.business.api.repository.PrecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.business.api.models.Preco;
import com.business.api.models.Produto;

@Service
public class PrecoService {

    @Autowired
    private ProdutoService produtoService;

    @Autowired
    private PrecoRepository precoRepository;

    public Iterable<Preco> findAll(){
        return precoRepository.findAll( );
    }

    public Preco findById(Integer codigoProduto) {

        Produto produto = produtoService.findById( codigoProduto );
        return precoRepository.findByCodigoProduto( produto );
    }

    public void inserir(Preco preco){
        precoRepository.save( preco );
        System.out.println("INSERIDO: " + preco);
    }

    public void alterar(Preco preco){
        precoRepository.save( preco );
        System.out.println("ALTERADO: " + preco);
    }
}
