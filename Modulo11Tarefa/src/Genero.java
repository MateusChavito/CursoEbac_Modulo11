import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Genero {
    public static void main(String[] args) {
        Nomes();
    }

    public static void Nomes() {
        System.out.println("***** NOMES *****");
        List<String> lista = new ArrayList<>();
        lista.add("Maria-M");
        lista.add("João-H");
        lista.add("Roberta-M");
        lista.add("Camila-M");

        List<String> homens = new ArrayList<>();
        List<String> mulheres = new ArrayList<>();

        for (String item : lista) {
            String[] partes = item.split("-");
            String nome = partes[0];
            String genero = partes[1];

            if (genero.equalsIgnoreCase("H")) {
                homens.add(nome);
            } else if (genero.equalsIgnoreCase("M")) {
                mulheres.add(nome);
            }
        }

        Collections.sort(homens);
        Collections.sort(mulheres);

        System.out.println("Homens:");
        for (String homem : homens) {
            System.out.println(homem + "-H");
        }

        System.out.println("Mulheres:");
        for (String mulher : mulheres) {
            System.out.println(mulher + "-M");
        }
    }
}
