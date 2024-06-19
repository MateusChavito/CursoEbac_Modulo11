import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        Nomes();

    }
        public static void Nomes(){
            System.out.println("***** NOMES *****");
            List<String> lista = new ArrayList<>();
            lista.add("Maria");
            lista.add("João");
            lista.add("roberta");
            lista.add("Camila");

            Collections.sort(lista);

            System.out.println(lista);







    }

}
