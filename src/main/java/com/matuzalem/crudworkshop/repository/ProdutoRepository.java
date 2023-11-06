package com.matuzalem.crudworkshop.repository;

import com.matuzalem.crudworkshop.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
