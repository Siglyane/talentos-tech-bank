package dia7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4};

        // É a única forma possivel do java aceitar variáveis de tipos diferentes, PORÉM NÃO É UMA BOA PRÁTICA!!!
        // E DEVE SER EVITADO.
        Object[] vetor2 = {1, 2, 3, 4, "asd", true};

        // Classes que representam tipos primitivos
        Integer i = 0; // int
        Short s = 0; // short
        Long l = 0L; // long
        Float f = 0f; // float
        Double d = 0.0; //double
        Character c = 'a'; //char
        String str = ""; // não possui primitivo

        List<Integer> lista = new ArrayList<>(Arrays.asList(1,2,3));

        System.out.println(lista);

        // Adiciona os valores
        lista.add(1);
        lista.add(2);

        System.out.println(lista);

        //Remove item conforme posição
        lista.remove(0);

        System.out.println(lista);

        // Como inserir a variável vetor que é um int na lista abaixo sem alterar o tipo dela declarado anteriormente:
        List<Integer> lista2 = new ArrayList<>();


        for (int v: vetor) {
            lista2.add(v);
        }

        System.out.println("Lista convertida de int para Integer");
        System.out.println(lista2);

        List<Double> notas = new ArrayList<>(Arrays.asList(2d, 3d, 4d));

        notas.remove(2);

        System.out.println(notas);

        for (Double nota : notas) {
            System.out.println(nota);
        }

        for (int j = 0; j < notas.size(); j++) {
            System.out.println(notas.get(j));
        }

        System.out.println("For do lambda");
        notas.stream().forEach((nota -> System.out.println(nota)));


        System.out.println("For lambda reduzido");
        notas.forEach(System.out::println);

        // Criando uma lista imutável
        System.out.println("Imutável");

        List<Integer> testeImutavel = Arrays.asList(1, 2, 3);
        testeImutavel = Collections.unmodifiableList(testeImutavel);

        System.out.println(testeImutavel.get(0));
        testeImutavel.set(0, 5);
        System.out.println(testeImutavel.get(0));

    }
}
