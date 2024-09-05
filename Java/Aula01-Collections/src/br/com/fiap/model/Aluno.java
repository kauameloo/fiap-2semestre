package br.com.fiap.model;

public class Aluno {
    private String nome;
    private String rm;
    private int idade;
    private double nota1;
    private double nota2;

    public Aluno(String Nome, int Idade, String RM, double Nota1, double Nota2) {
        this.nome = Nome;
        this.rm = RM;
        this.idade = Idade;
        this.nota1 = Nota1;
        this.nota2 = Nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRm() {
        return rm;
    }

    public void setRm(String rm) {
        this.rm = rm;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", rm=" + rm + ", idade=" + idade + ", nota1: " + nota1 + ", nota2: " + nota2
                + "]";
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }
}
