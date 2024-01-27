package com.api3.testando.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pessoas")
public class Pessoa {

     /**
      * buscar informações sobre as anotações/annotation
      * Id
      * responsável pela chave primária
      * GeneratedValue(strategy = GenerationType.IDENTITY)
      * gera valor crescente começando pelo numero 1
     */


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo; // chave primaria
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }


    private String nome;
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    private int idade;
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
    
    
}
