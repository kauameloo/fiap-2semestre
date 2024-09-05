package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.model.Aluno;

public class Exercicio02 {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        int escolha;
        do {
            // Adicionar o aluno
            System.out.println("Insira o nome:");
            String nome = System.console().readLine();
            System.out.println("Insira a idade:");
            int idade = Integer.parseInt(System.console().readLine());
            System.out.println("Insira o RM:");
            String rm = System.console().readLine();
            System.out.println("Insira a nota 1:");
            double nota1 = Double.parseDouble(System.console().readLine());
            System.out.println("Insira a nota 2:");
            double nota2 = Double.parseDouble(System.console().readLine());

            Aluno aluno = new Aluno(nome, idade, rm, nota1, nota2);
            alunos.add(aluno);

            System.out.println("Aluno adicionado com sucesso!");

            // Perguntar se deseja adicionar mais alunos
            System.out.println("Adicionar outro aluno?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            System.out.print("Escolha: ");
            escolha = Integer.parseInt(System.console().readLine());
        } while (escolha == 1);

        // Imprimir os aluns
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

}
