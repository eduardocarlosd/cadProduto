package br.edu.granbery.AutoCar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Proprietario {
    private int id ;
    private String nome;
    private String telefone;
    private String email;
}
