package dia2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

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

    public static void validaSystemInString(Scanner in) {
        if (!in.hasNext()) {
            System.out.println("Você precisa digitar uma string");
            in.close();
            System.exit(1);
        }
    }

    public static void validaSystemInDouble(Scanner in) {
        if (!in.hasNextDouble()) {
            System.out.println("Você precisa informar um número do tipo inteiro");
            in.close();
            System.exit(1);
        }
    }

    public static void exercicio1() {
        /* 1.Escreva um algoritmo que leia um número inteiro e diga se ele é par ou ímpar. */
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número inteiro aleatório");
        validaSystemInInteiro(in);
        int numero = in.nextInt();


        System.out.println("IF/ELSE");
        if (numero % 2 == 0) {
            System.out.println(numero + " é um número par");
        } else {
            System.out.println(numero + " é um número impar");
        }

        System.out.println("SWITCH/CASE");
        // Nesse caso é mais ideal usar o IF/ELSE, por ter poucos casos
        int mod = numero % 2;

        switch (mod) {
            case 0:
                System.out.println(numero + " é um número par");
                break;
            default:
                System.out.println(numero + " é um número impar");
        }

        System.out.println("IF/ELSE TERNÁRIO");
        String resultadoTernario = numero % 2 == 0 ? "É um número par" : "É um número impar";
        System.out.println(resultadoTernario);

        in.close();
    }

    public static void exercicio2() {
    /*
    Elabore um algoritmo que dada a idade de um nadador classifique-o em uma das seguintes categorias:
    Infantil A = 5 a 7 anos
    Infantil B = 8 a 11 anos
    Juvenil A = 12 a 13 anos
    Juvenil B = 14 a 17 anos
    Adultos = Maiores de 18 anos */
        Scanner in = new Scanner(System.in);
        System.out.println("Digite sua idade");

        validaSystemInInteiro(in);
        int teste = in.nextInt();


        if (teste >= 18) {
            System.out.println("Sua categoria é Adultos");
        } else if (teste <= 17 && teste >= 14) {
            System.out.println("Sua categoria é Juvenil B");
        } else if (teste <= 13 && teste >= 12) {
            System.out.println("Sua categoria é Juvenil A");
        } else if (teste <= 11 && teste >= 8) {
            System.out.println("Sua categoria é Infantil B");
        } else if (teste <= 7 && teste >= 5) {
            System.out.println("Sua categoria é Infantil A");
        } else {
            System.out.println("Você ainda não possui idade necessária para ser um nadador");
        }
        in.close();

    }

    public static void exercicio3() {
    /* Escreva um algoritmo em Java que leia dois números inteiros e determine qual é o menor.
    Escreva um algoritmo que determina o maior também. */
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro");
        validaSystemInInteiro(in);
        int numero1 = in.nextInt();

        System.out.println("Digite o segundo número inteiro");
        validaSystemInInteiro(in);
        int numero2 = in.nextInt();
        in.close();

        // Resolução If Else
        // Avoid concatenation Java
        if (numero1 > numero2) {
            System.out.println("O número " + numero1 + " é maior que o número " + numero2);
        } else if (numero2 > numero1) {
            System.out.println("O número " + numero2 + " é maior que o número " + numero1);
        } else if (numero1 == numero2) {
            System.out.println("Ambos possuem o mesmo valor");
        }

        // Resolução com térnario

        if (numero1 == numero2) {
            System.out.println("Os números são iguais");
        } else {
            System.out.println(
                    numero1 > numero2
                            ? String.format("O primeiro número %d é maior que %d", numero1, numero2)
                            : String.format("O segundo número %d é maior que %d", numero2, numero1)
            );
        }

    }

    public static void exercicio4() {
    /* Construa um algoritmo que leia 10 valores inteiros e positivos e:
    Encontre o maior valor
    Encontre o menor valor
    Calcule a média dos números lidos */

        // TODO alterar o int do maior valor e menor valor
        Scanner in = new Scanner(System.in);
        int valores[] = new int[10];
        int maiorValor = 0;
        int menorValor = 32767;
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

    public static void exercicio5() {
        /*Escreva um algoritmo em Java que seja capaz de fazer as seguintes operações matemáticas
        (adição, subtração, multiplicação e divisão). Todas as operações serão entre dois valores.
         No começo do algoritmo pergunte ao usuário qual operação ele deseja fazer e quais são os valores.*/
        Scanner in = new Scanner(System.in);

//        System.out.println("Selecione um das opções informando o número ao lado: Adição [0], Subtração [1], " +
//                "Multiplição [2] ou Divisão [3]");
//        int operacaoSelecionada = in.nextInt();

        System.out.println("Selecione um das opções informando a letra ao lado: Adição [a], Subtração [s], " +
                "Multiplição [m] ou Divisão [d]");
        validaSystemInString(in);
        char operacaoSelecionada = in.next().charAt(0); //Pegar somente o char localizado no 0

        System.out.println("Digite o primeiro número da operação");
        validaSystemInDouble(in);
        double numero1 = in.nextDouble();

        System.out.println("Digite o segundo número da operação");
        validaSystemInDouble(in);
        double numero2 = in.nextDouble();

        double resultado;
        switch (operacaoSelecionada) {
            case 'a':
                resultado = numero1 + numero2;
                System.out.printf("O resultado da soma é: %f", resultado);
                break;
            case 's':
                resultado = numero1 - numero2;
                System.out.printf("O resultado da subtração é: %f", resultado);
                break;
            case 'm':
                resultado = numero1 * numero2;
                System.out.printf("O resultado da multiplicação é: %f", resultado);
                break;
            case 'd':
                if (numero2 == 0) {
                    System.out.println("Não se pode dividir por 0");
                    break;
                }
                resultado = numero1 / numero2;
                System.out.printf("O resultado da divisão é: %f", resultado);
                break;
        }

        in.close();
    }

    public static void exercicio6() {
    /* Faça a implementação do Jogo Pedra, Papel e Tesoura (Jokempô). O algoritmo deverá perguntar qual é a escolha do jogador
     1 (Pedra [pe], Papel [pa], Tesoura [t]) e deverá fazer o mesmo para o jogador 2.
     No final da execução o algoritmo deverá dizer qual é o jogador vencedor ou se houve empate */
        Scanner in = new Scanner(System.in);
        // TODO validar se a opção de jogo escolhido existe
        System.out.println("Primeiro jogador, escolha entre Pedra [1], Papel [2] ou Tesoura [3]");
        validaSystemInInteiro(in);
        int primeiroJogador = in.nextInt();
        System.out.println("Segundo jogador, agora você escolhe entre Pedra [1], Papel [2] ou Tesoura [3]");
        validaSystemInInteiro(in);
        int segundoJogador = in.nextInt();
        in.close();


        if (primeiroJogador == segundoJogador) {
            System.out.println("Vocês empataram");
        } else if (primeiroJogador == 1) {
            String quemGanhou = segundoJogador == 3 ? "Primeiro jogador é o vencedor" : "Segundo jogador é o vencedor";
            System.out.println(quemGanhou);
        } else if (primeiroJogador == 2) {
            String quemGanhou = segundoJogador == 1 ? "Primeiro jogador é o vencedor" : "Segundo jogador é o vencedor";
            System.out.println(quemGanhou);
        } else if (primeiroJogador == 3) {
            String quemGanhou = segundoJogador == 2 ? "Primeiro jogador é o vencedor" : "Segundo jogador é o vencedor";
            System.out.println(quemGanhou);
        }


    }
}
