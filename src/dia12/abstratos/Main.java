package dia12.abstratos;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void mostrarValorAPagar(List<Empregado> empregados) {
        for (Empregado e : empregados) {
            System.out.println(e);
            System.out.println(e.ganha());
        }
    }

    public static void main(String[] args) {
        List<Empregado> empregados = new ArrayList<>();

        empregados.add(new Chefe("Pedro", 15_000));
        empregados.add(new PorComissao("José", 2_000, 10, 150));
        empregados.add(new PorItem("Maria", 35, 180));
        empregados.add(new PorHora("Camila", 100, 450));
        empregados.add(new PorHora("Marta", 100, 300));
        empregados.add(new PorHora("Janete", 100, -10));


        mostrarValorAPagar(empregados);


    }
}

