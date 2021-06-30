package dia1;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        exercicio4();

    }

    public static void exercicio1() {
        /* 1. Escreva um algoritmo que armazene o valor 99 em uma variável Y e o valor 11
        em uma variável Z. A seguir (utilizando apenas atribuições entre variáveis) troque
        os seus conteúdos fazendo com que o valor que está em Y passe para Z e vice-versa.
        Ao final, escrever os valores que ficaram armazenados nas variáveis. */

        byte y = 99;
        byte z = 11;
        byte x = y;

        System.out.printf("O valor da variável Y antes da troca é = %d\n", y);
        System.out.printf("O valor da variável Z antes da troca é = %d\n", z);

        y = z;
        z = x;


        System.out.println("O valor da variável Y depois da troca é = " + y);
        System.out.println("O valor da variável Z depois da troca é = " + z);
    }


    public static void exercicio2() {
        /* 2. Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor. */
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor para mostrar seu antecessor");
        int valor = in.nextInt();
        //TODO tratar erros de inputs diferentes de inteiros

        System.out.println("Você digitou: " + valor);
        --valor;
        System.out.println("Seu antecessor é: " + valor);
        in.close();
    }

    public static void exercicio3() {
        /* 3.Escreva um algoritmo para ler as dimensões de um retângulo
         (base e altura), calcular e escrever a área do retângulo.
         */
        //TODO tratar erros de inputs diferentes de inteiros
        Scanner in = new Scanner(System.in);
        double base, altura, area;

        System.out.println("Escreva o valor da base do seu retângulo");
        base = in.nextDouble();

        System.out.println("Agora escreva o valor da altura do seu retângulo.");
        altura = in.nextDouble();

        area = base * altura;
        System.out.println("A área do retângulo é: " + area);
        in.close();
    }

    public static void exercicio4() {
     /* 4. Escreva um algoritmo para ler o número total de eleitores de um município,
      o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que
       cada um representa em relação ao total de eleitores.
      */
        Scanner in = new Scanner(System.in);
        double eleitores, votosBrancos, votosNulos, votosValidos,
                percentualVotosBrancos, percentualVotosNulos, percentualVotosValidos,
                auxiliarPercentual;

        System.out.println("Insira o número de eleitores do município");
        eleitores = in.nextDouble();

        System.out.println("Insira o número total de votos brancos");
        votosBrancos = in.nextDouble();

        System.out.println("Insira o número total de votos nulos");
        votosNulos = in.nextDouble();

        System.out.println("Insira o número total de votos válidos");
        votosValidos = in.nextDouble();
        in.close();

        auxiliarPercentual = 100/eleitores;
        percentualVotosBrancos = votosBrancos * auxiliarPercentual;
        percentualVotosNulos = votosNulos * auxiliarPercentual;
        percentualVotosValidos = votosValidos * auxiliarPercentual;

        System.out.println("------");
        System.out.println("O percentual de votos em branco é " + percentualVotosBrancos + "%");
        System.out.println("O percentual de votos nulos é " + percentualVotosNulos + "%");
        System.out.println("O percentual de votos válidos é " + percentualVotosValidos + "%");
    }
}