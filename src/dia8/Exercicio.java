package dia8;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        desafio1();
    }

    public static void desafio1() {
        //Dado um array de números inteiros com valores negativos e positivos, encontro o número mais próximo de zero.
        // Se ouver valores como 2 e -2, considere o número positivo.
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número inteiro, varie entre positivo e negativo");
            numeros[i] = in.nextInt();
        }
        in.close();

        int numeroPositivo = Integer.MAX_VALUE;
        int numeroNegativo = Integer.MIN_VALUE;

        for (Integer numero : numeros) {
            if (numero < numeroPositivo && numero > 0) {
                numeroPositivo = numero;
            }
            if (numero > numeroNegativo && numero < 0) {
                numeroNegativo = numero;
            }
        }

        System.out.println("O número mais proximo de zero é: ");
        System.out.println((numeroPositivo <= Math.abs(numeroNegativo) ? numeroPositivo : numeroNegativo));

    }
}
