import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        // Criar uma coleção de esportes olímpicos
        Set<String> esportesOlimpicos = new HashSet<>();
        // Adicionar 4 esportes
        esportesOlimpicos.add("Basquete");
        esportesOlimpicos.add("Tênis de mesa");
        esportesOlimpicos.add("Natação");
        esportesOlimpicos.add("Futebol");

        // Exibir os esportes do conjunto
        for (String item : esportesOlimpicos) {
            System.out.println(item);
        }
    }
}
