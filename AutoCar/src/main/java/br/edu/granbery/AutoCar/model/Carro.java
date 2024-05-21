package br.edu.granbery.AutoCar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "car")

public class Carro {
    @Id
    private String placa;
    private int anoFabricacao;
    private String cor;
    private String modelo;
    private String marca;
    private Proprietario dono;
}
