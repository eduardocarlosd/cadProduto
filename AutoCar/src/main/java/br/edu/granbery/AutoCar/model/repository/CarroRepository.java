package br.edu.granbery.AutoCar.model.repository;

import br.edu.granbery.AutoCar.model.Carro;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CarroRepository extends MongoRepository<Carro,String> {

    @Query("{'anoFabricacao':  {'$lt' : 1994}}")
    public List<Carro> carrosAntigos();

}
