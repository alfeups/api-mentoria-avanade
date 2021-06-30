package com.business.api.services;

import com.business.api.models.Produto;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProdutoService {
    public List<Produto> findAll(){
        List<Produto> listaProduto = new ArrayList<Produto>();
        Produto p1 = new Produto('1', "descricao1", new Date(), "123456789", true);
        Produto p2 = new Produto('1', "descricao1", new Date(), "987654321", true);
        listaProduto.add(p1);
        listaProduto.add(p2);
        return listaProduto;

    }

}
