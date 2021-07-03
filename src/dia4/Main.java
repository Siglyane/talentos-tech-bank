package dia4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    aprendendoFor();

    }

    public static void whileDoWhile() {
        System.out.println("WHILE");
        int contagem = 11;

        while (contagem < 11) {
            System.out.println(contagem);
            contagem++;
        }

        System.out.println("DO WHILE");
        contagem = 11;

        //
        do {
            System.out.println(contagem);
            contagem++;
        } while (contagem < 11);
    }

    //TODO pesquisar cenários melhores para while e do while

    public static void aprendendoFor() {
        // para ( i = 0; i < 10; i++)

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Iterando sobre uma lista com forEach");

        List<Integer> minhaListaDeInteiros = new ArrayList<>();
        minhaListaDeInteiros.add(1);
        minhaListaDeInteiros.add(2);
        minhaListaDeInteiros.add(3);

        minhaListaDeInteiros.forEach(item -> {
            System.out.println(item);
        });

        System.out.println("Iterando sobre a lista com for convencional");

        for (int i = 0; i < minhaListaDeInteiros.size(); i++) {
            System.out.println(minhaListaDeInteiros.get(i));
        }

        System.out.println("Iterando sobre a lista com while");

        int j = 0;

        while (j < minhaListaDeInteiros.size()) {
            System.out.println(minhaListaDeInteiros.get(j));
            j++;
        }

        System.out.println("Método for-each"); //TODO pesquisar o nome exato da tecnica

        for (int x: minhaListaDeInteiros) {
            System.out.println(x);
        }

        //Repetição com método recursivo
        //Cuidado, pode estourar a pilha de execução do Java, Stack Overflow

        System.out.println("Loop Recursivo");
        System.out.println(metodoRecursivo(1));

    }

    public static int metodoRecursivo(int i) {
        if (i <= 10) {
            return metodoRecursivo(i + 1);
        }

        return i;
    }

}
