package com.example.cadpodutos.model.DAO;

import com.example.cadpodutos.model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdutoRepository extends MongoRepository<Produto,Integer> {

}
