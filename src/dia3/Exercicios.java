package dia3;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
      exercicio2ComRecursao();
    }

    public static void validaSystemInInteiro(Scanner in) {
        if (!in.hasNextInt()) {
            System.out.println("Você precisa informar um número do tipo inteiro");
            in.close();
            System.exit(1);
        }
    }

    public static void exercicio1() {
//        Construa um algoritmo que leia 10 valores inteiros e positivos e:
//        Encontre o maior valor
//        Encontre o menor valor
//        Calcule a média dos números lidos Esse exercício foi dado na aula 3 e agora vamos otimizar ele utilizando o
//        while e for.
        Scanner in = new Scanner(System.in);
        int valores[] = new int[10];
        int maiorValor = Integer.MAX_VALUE;
        int menorValor = Integer.MIN_VALUE;
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o um número inteiro");
            validaSystemInInteiro(in);
            valores[i] = in.nextInt();
            soma += valores[i];
            if (valores[i] > maiorValor) {
                maiorValor = valores[i];
            }
            if (valores[i] < menorValor) {
                menorValor = valores[i];
            }
        }
        in.close();
        int valorMedio = soma / valores.length;
        System.out.println("O Maior valor é " + maiorValor);
        System.out.println("O menor valor é " + menorValor);
        System.out.println("O valor médio é " + valorMedio);

    }

    public static void exercicio2() {
//    Construa um algoritmo usando uma estrutura de repetição que calcule o fatorial de um número.
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número inteiro que você deseja calcular o fatorial");
        int numeroFatorial = in.nextInt();
        int resultadoFatorial = 1;


        while (numeroFatorial > 1) {
            resultadoFatorial = resultadoFatorial * numeroFatorial;
            numeroFatorial--;
        }

        System.out.println(resultadoFatorial);


        for (int i = numeroFatorial; i > 1; i--) {
            resultadoFatorial = resultadoFatorial * i;
        }
        System.out.println(resultadoFatorial);
        in.close();
    }

    public static int fatorialRecursivo(int x) {
        if (x == 0) {
            return 1;
        }

        return x * fatorialRecursivo(x - 1);
    }

    public static void exercicio2ComRecursao() {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o número para saber o fatorial");
        int x = in.nextInt();
        System.out.println(fatorialRecursivo(x));
        in.close();

    }

}
