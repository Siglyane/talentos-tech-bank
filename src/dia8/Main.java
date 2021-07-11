package dia8;

import dia8.exercicios.agenda.Pessoa;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> meusNumeros = new HashSet<>();

        meusNumeros.add(1);
        meusNumeros.add(1);

        // Imprime somente um, pois o Set não permite valores repetidos
        System.out.println(meusNumeros);

        Set<Pessoa> pessoas = new HashSet<>();

        Pessoa pessoa1 = new Pessoa("Janaina", 1994, 1.69, "985224538");
        pessoas.add(pessoa1);

        Pessoa pessoa2 = new Pessoa("Janaina", 1994, 1.69, "985224538");
        pessoas.add(pessoa2);

        //Imprime os dois pois o nosso Objeto Pessoa não tem um hashCode
        System.out.println(pessoas);
    }
}
