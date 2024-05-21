package com.example.cadpodutos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document //indica que vai virar uma coleção no banco de dados
public class Produto {

    @Id
    private int id;
    private String descricao;
    private int estoque;
    private double precoMedio;
    private double lucro;
    private Fabricante fabricante;


}
