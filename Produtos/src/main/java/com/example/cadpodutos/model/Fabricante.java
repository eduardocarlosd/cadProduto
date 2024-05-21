package com.example.cadpodutos.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fabricante {

    private int id;
    private String nome;
    private String telefone;

}
