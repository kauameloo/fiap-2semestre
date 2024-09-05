package br.com.fiap.teste;

import java.io.File;

public class ArquivoTeste {
    public static void main(String[] args) {
        // Criar um objeto que representa uma pasta
        File pasta = new File("diretorio");

        // Se a pasta não existir, criar a pasta
        if (!pasta.exists()) {
            pasta.mkdir();
            System.out.println("Pasta criada!");
        }

        // Criar um arquivo dentro da pasta diretorio
        File arquivo = new File(pasta, "arquivo.txt");
        if (!arquivo.exists()) {
            try {
                arquivo.createNewFile();
                System.out.println("Arquivo criado!");
            } catch (Exception e) {
                System.out.println("Erro ao criar arquivo: " + e.getMessage());
            }
        }
    }
}
