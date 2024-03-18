import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Titulo> titulos = new ArrayList<>();

        var t1 = new Titulo("O poderoso chefão");
        var t2 = new Titulo("The Batman");
        var t3 = new Titulo("Homem-Aranha");

        titulos.add(t1);
        titulos.add(t2);
        titulos.add(t3);

        Collections.sort(titulos);

        System.out.println("Títulos Ordenados: " + titulos);
    }
}
