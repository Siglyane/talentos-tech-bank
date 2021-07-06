package dia7;

import java.util.*;

public class Exercicios {
    public static void main(String[] args) {
        exercicio5();
    }

    public static void validaSystemInInteiro(Scanner in) {
        if (!in.hasNextInt()) {
            System.out.println("Você precisa informar um número do tipo inteiro");
            in.close();
            System.exit(1);
        }
    }

    public static void exercicio1() {
        // 1. Escreva um algoritmo que leia números insira em um array e após mostre os números informados na tela.
        // Ler somente 5 números.
        // Exemplo em List:

        System.out.println("Em Array");
        Scanner in = new Scanner(System.in);
        int[] listaArray = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número inteiro");
            validaSystemInInteiro(in);
            listaArray[i] = in.nextInt();
        }
        in.close();
        System.out.println(Arrays.toString(listaArray));

        System.out.println("Em List");
//        Scanner in = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número inteiro");
            validaSystemInInteiro(in);
            lista.add(in.nextInt());
        }
        in.close();
        System.out.println(lista);


    }

    public static void exercicio2() {
//     Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números negativos.
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número inteiro, deve informar números positivos e negativos");
            validaSystemInInteiro(in);
            numeros[i] = in.nextInt();
        }
        in.close();

        int totalNegativos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                totalNegativos++;
            }
        }

//        Exemplo de outra forma de percorrer o código.
//        for (Integer numero : numeros) {
//            if (numero < 0) {
//                totalNegativos++;
//            }
//        }

        // TODO verificar com o Anderson
//        System.out.println(numeros.stream().filter(numero -> numero < 0).count());

        System.out.printf("Você digitou %d número negativos", totalNegativos);
        if (totalNegativos == 0) {
            System.out.println("Você não digitou números negativos");
        }

    }

    public static void exercicio3() {
//     Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números pares.
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número inteiro");
            validaSystemInInteiro(in);
            numeros[i] = in.nextInt();
        }
        in.close();
        int totalPares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                totalPares++;
            }
        }
        System.out.printf("Você digitou %d número pares", totalPares);

        if (totalPares == 0) {
            System.out.println("Você não digitou números pares");
        }

    }

    public static void exercicio4() {
//     Escreva um algoritmo que leia números, insira em um array e após mostre o maior valor.
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número inteiro");
            validaSystemInInteiro(in);
            numeros[i] = in.nextInt();
        }
        in.close();

        // Com List
//        List<Integer> lista = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Digite um número inteiro");
//            validaSystemInInteiro(in);
//            lista.add(in.nextInt());
//        }

//        System.out.println(Collections.max(numeros));


        int maiorNumero = Integer.MIN_VALUE;
        for (Integer numero : numeros) {
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        System.out.printf("O maior número é %d", maiorNumero);


    }


    public static void exercicio5() {
//     Escreva um algoritmo que simula um jogo da forca simples. o usuario precisara adivinhar uma palavra chutando cada
//     letra em no máximo 10 chutes, caso o usuario acerte a letra o jogo dirá que ele acertou, caso tenha errado, o numero
//     de tentativas vai diminuindo. Caso o numero de tentativas chegue a 0 o usuário perde.

        Scanner in = new Scanner(System.in);
        System.out.println("Jogo da Forca");
        System.out.println("Número de tentativas totais: 10");
        int chutes = 10;
        List<Character> palavra = new ArrayList<>(Arrays.asList('a', 'm', 'o', 'r', 'a'));
        char[] erros = new char[10];
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Insira uma letra para tentar adivinhar a palavra:");
            char tentativa = in.next().charAt(0);
            if (palavra.contains(tentativa)) {
                System.out.println("A palavra possui esta letra!");
                int posicao = palavra.indexOf(tentativa);
                System.out.println("Uma das posições dessa letra é: " + (posicao + 1));
                i--;
                contador++;
                if (contador > 3) {
                    System.out.println("Você possui todas as letras");
                    break;
                }
            } else {
                erros[i] = tentativa;
                System.out.println("Você errou");
                System.out.printf("%d/10 tentativas.", (i + 1));
                System.out.println("\nLetras erradas inseridas:" + Arrays.toString(erros));

            }


        }

        System.out.println("A palavra era: Amora");
        in.close();


    }


}


