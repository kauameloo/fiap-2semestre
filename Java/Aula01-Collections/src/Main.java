import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //// List é uma interface
        // List compras;

        //// ArrayList é uma classe que implementa a interface List
        //// Poderia alterar " List<String> " por " ArrayList<>() ", mas caso fosse
        //// utilizar outra classe que implementa List, iria dar erro.
        List<String> compras = new ArrayList<>();

        //// Adicionar um objeto na lista " compras "
        compras.add("Arroz");
        compras.add("Feijão");
        // compras.add(100); erro de compilação por causa do generics

        //// Exibir quantidade de elementos da lista
        int tamanho = compras.size();
        System.out.println("Quantidade de elementos: " + tamanho);

        //// Remover o Feijão da lista
        //// Se tiver dois "Feijão" na lista, apenas o primeiro é removido
        compras.remove("Feijão");

        //// Validar se o Macarrão está na lista
        boolean existe = compras.contains("Macarrão");
        System.out.println("Macarrão está na lista?" + existe);

        //// Criar um array(vetor) da lista
        String[] array = compras.toArray(new String[] {});
        System.out.println(array);

        //// Adicionar o Macarrão na primeira posição da lista
        compras.add(0, "Macarrão");

        //// Recuperar o item da compra da posição 0
        String itemm = compras.get(0);
        System.out.println(itemm);

        //// Apagar toda a lista de compra
        compras.clear();

        //// Adicionar os itens Playstation, Xbox, TV, Nintendo
        compras.add("Playstation");
        compras.add("Xbox");
        compras.add("TV");
        compras.add("Nintendo");

        //// Substituir o item da posição 0 por Chocolate
        compras.set(0, "Chocolate");

        //// Achar a posição do primeiro Chocolate
        int posicao = compras.indexOf("Chocolate");
        System.out.println("Posição do Chocolate: " + posicao);

        //// Criar uma sublista dos dois primeiros itens da lista
        List<String> subLista = compras.subList(0, 2);
        System.out.println(subLista);
        //// Percorrer a lista e exibir o item da lista
        for (String item : compras) {
            System.out.println(item);
        }
    }
}
