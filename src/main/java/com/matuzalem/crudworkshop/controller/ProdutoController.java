package com.matuzalem.crudworkshop.controller;


import com.matuzalem.crudworkshop.dto.ProdutoDto;
import com.matuzalem.crudworkshop.model.Produto;
import com.matuzalem.crudworkshop.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public String primeiroMetodo(){
        return produtoService.pimeiroMetodoService();
    }

    @PostMapping
    public String save(@RequestBody ProdutoDto produtoDto){
       String retorno = produtoService.save(produtoDto);
       return retorno;
    }
}
