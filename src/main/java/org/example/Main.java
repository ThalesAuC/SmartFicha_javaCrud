package org.example;

import java.util.Scanner;
import org.example.model.Paciente;
public class Main {
    public static void main(String[] args) {
        Scanner inputer = new Scanner(System.in);

        System.out.println("SmartFicha");
        System.out.println("Sistema de cadastro de pacientes, Selecione uma opção para seguir:");
        int opcaoSelecionada = inputer.nextInt();
        inputer.nextLine();
        System.out.println("[1] Novo Paciente");
        System.out.println("[2] Buscar Paciente");
        System.out.println("[3] Listar Pacientes");
        System.out.println("[4] Alterar Cadastro");
        System.out.println("[5] Remover Cadastro");
        System.out.println("[0] SAIR");

        switch (opcaoSelecionada){
            case 0:
                System.out.println("Fechando sistema, pressione uma tecla para continuar");
                inputer.nextLine();
                System.exit(0);
                break;

            case 1:
                System.out.println("Insira o CPF do Paciente: ");
                String CPF = inputer.nextLine();

                System.out.println("Insira o Nome do Paciente: ");
                String Nome = inputer.nextLine();

                System.out.println("Insira a idade do Paciente: ");
                int idade = inputer.nextInt();
                inputer.nextLine();


                break;
        }

    }
}