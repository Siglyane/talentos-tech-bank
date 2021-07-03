package dia5;

import java.util.Scanner;

public class Main {
    // Revisão e exercícios de fixação loops

    public static void main(String[] args) {
        revisaoQuestaoI();
        revisaoQuestaoII();
        revisaoQuestaoIII();
        revisaoQuestaoIV();
        revisaoQuestaoV();
        revisaoQuestaoVI();
    }

    public static void validaSystemInInteiro(Scanner in) {
        if (!in.hasNextInt()) {
            System.out.println("Você precisa informar um número do tipo inteiro");
            in.close();
            System.exit(1);
        }
    }

    public static void revisaoExercicio1() {
        //System.out.println(Math.pow(2, 3));

        // Faça um programa que calcula o exponencial a partir de sua base e sua potencia
        // Por exemplo, 2 elevado 3 = 8
        Scanner in = new Scanner(System.in);
        System.out.println("Para calcular a exponencial digite o valor da base");
        validaSystemInInteiro(in);
        int base = in.nextInt();

        System.out.println("Digite o valor do expoente");
        validaSystemInInteiro(in);
        int expoente = in.nextInt();
        int resultado = base;

        for (int i = expoente; i > 1; i--) {
            resultado *= base;
        }
        System.out.printf("Resultado: %d", resultado);
    }

    public static void revisaoQuestaoI() {

        System.out.println("Questão I");
        for (int i = 0; i < 5; i++) {
            System.out.printf("\n");
            for (int j = 0; j < 10; j++) {
                System.out.printf("*");
            }
        }
    }
    public static void revisaoQuestaoII() {

        System.out.println("\nQuestão II");
        for (int i = 0; i < 5; i++) {
            System.out.printf("\n");
            for (int j = 0; j <= i; j++) {
                System.out.printf("*");
            }
        }
    }
    public static void revisaoQuestaoIII() {

        System.out.println("\nQuestão III");
        int linhas = 5;
        for (int i = 1; i <= linhas; i++) {
            int k = linhas - i;

            while (k > 0) {
                System.out.print(" ");
                k--;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
    public static void revisaoQuestaoIV() {

        System.out.println("\nQuestão IV");

        int linhas = 5;
        for (int i = 1; i < linhas; i++) {
            int espacos = linhas - i;

            while (espacos > 0) {
                System.out.print(" ");
                espacos--;
            }

            int k = 0;
            while (k != 2 * i - 1) {
                System.out.print("*");
                k++;
            }
            System.out.println(" ");
        }

    }
    public static void revisaoQuestaoV() {

        System.out.println("\nQuestão V");

        int linhas = 6;
        for (int i = 1; i < linhas; i++) {
            int espacos = linhas - i;

            while (espacos > 0) {
                System.out.print(" ");
                espacos--;
            }

            int k = 0;
            while (k != 2 * i - 1) {
                System.out.print(i);
                k++;
            }
            System.out.println(" ");
        }
    }
    public static void revisaoQuestaoVI() {

        System.out.println("Questão VI");
        //@autor Virginia
        int rows = 5;
        System.out.println(" ");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (rows - i) * 2; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(" " + k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(" " + l);
            }
            System.out.println();
        }
    }
    }

