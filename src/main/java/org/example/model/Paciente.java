package org.example.model;

public class Paciente {
    private String CPF;
    private String nome;
    private int idade;
    private String phone;

    public Paciente(String nome, int idade, String CPF, String phone){
        this.CPF = CPF;
        this.nome = nome;
        this.idade = idade;
        this.phone = phone;
    }
    public String getCPF() {return CPF;}
    public String getNome() {return nome;}
    public int getIdade() {return idade;}
    public String getPhone() {return phone;}
}
