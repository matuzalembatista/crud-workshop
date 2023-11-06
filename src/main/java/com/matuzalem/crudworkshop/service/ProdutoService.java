package com.matuzalem.crudworkshop.service;

import com.matuzalem.crudworkshop.dto.ProdutoDto;
import com.matuzalem.crudworkshop.model.Produto;
import com.matuzalem.crudworkshop.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;
    public String pimeiroMetodoService(){
        return "Aqui eh service";
    }

    public String save(ProdutoDto produtoDto){
        Produto produto = new Produto();
        produto.setId(produtoDto.getId());
        produto.setNome(produtoDto.getNome());
        produto.setValor(produtoDto.getValor());

        produtoRepository.save(produto);
        return "Produto salvo!";
    }
}
