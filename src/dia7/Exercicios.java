package dia7;

import java.util.*;

public class Exercicios {
    public static void main(String[] args) {

        exercicio5Correcao();
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
        int totalNegativos = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número inteiro, deve informar números positivos e negativos");
            validaSystemInInteiro(in);
            numeros[i] = in.nextInt();
            if (numeros[i] < 0) {
                totalNegativos++;
            }
        }
        in.close();

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
        List<Character> palavra = new ArrayList<>(Arrays.asList('a', 'm', 'o', 'r', 'a'));
        List<Character> tentativas = new ArrayList<>();
        int erros = 1;
        int acertos = 0;
        while (erros < 11) {
            System.out.println("Insira uma letra para tentar adivinhar a palavra:");
            char tentativa = in.next().charAt(0);
            if (tentativas.contains(tentativa)) {
                System.out.println("Você já tentou essa letra");
            } else if (palavra.contains(tentativa)) {
                System.out.println("A palavra possui esta letra!");
                int posicao = palavra.indexOf(tentativa);
                System.out.println("Uma das posições dessa letra é: " + (posicao + 1));
                System.out.println("\nLetras erradas que você tentou:" + tentativas);
                acertos++;

                if (acertos == palavra.size()) {
                    System.out.println("Parabéns, você ganhou!");
                    break;
                }
            } else {
                tentativas.add(tentativa);
                System.out.println("Você errou");
                System.out.printf("%d/10 tentativas.", erros);
                System.out.println("\nLetras erradas que você tentou:" + tentativas);
                erros++;

            }

        }
        if (erros >= 10) {
            System.out.println("Você perdeu!");
        }
        System.out.println("A palavra era: Amora");
        in.close();


    }

    public static void desafioPessoal() {
//      Acrescentei ao desafio do exercicio 5 um desafio pessoal de inserir uma forma randomica de escolher a palavra.

//     Escreva um algoritmo que simula um jogo da forca simples. o usuario precisara adivinhar uma palavra chutando cada
//     letra em no máximo 10 chutes, caso o usuario acerte a letra o jogo dirá que ele acertou, caso tenha errado, o numero
//     de tentativas vai diminuindo. Caso o numero de tentativas chegue a 0 o usuário perde.

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Jogo da Forca");
        System.out.println("Número de tentativas totais: 10");

        // Escolhendo uma palavra e separando em letras
        String[] palavras = {"amora", "banana", "canela", "manga", "morango"};
        String palavraEscolhida = palavras[random.nextInt(palavras.length)];
        List<Character> letras = new ArrayList<>();
        for (char separandoAsLetras : palavraEscolhida.toCharArray()) {
            if (!letras.contains(separandoAsLetras)) {
                letras.add(separandoAsLetras);
            }

        }

        //Validação das tentativas
        List<Character> tentativas = new ArrayList<>();
        int erros = 1;
        int acertos = 0;
        while (erros < 11) {
            System.out.println("\nInsira uma letra para tentar adivinhar a palavra:");
            char tentativa = in.next().charAt(0);
            if (tentativas.contains(tentativa)) {
                System.out.println("Você já tentou essa letra");
            } else if (letras.contains(tentativa)) {
                System.out.println("A palavra possui esta letra!");
                int posicao = letras.indexOf(tentativa);
                System.out.println("Uma das posições dessa letra é: " + (posicao + 1));
                tentativas.add(tentativa);
                System.out.printf("\nLetras que já testou: %s", tentativas);
                acertos++;

                if (acertos == letras.size()) {
                    System.out.println("Parabéns, você ganhou!");
                    break;
                }
            } else {
                tentativas.add(tentativa);
                System.out.println("Você errou");
                System.out.printf("%d/10 tentativas.", erros);
                System.out.printf("\nLetras que já testou: %s", tentativas);
                erros++;

            }

        }
        if (erros >= 10) {
            System.out.println("Você perdeu!");
        }
        System.out.printf("A palavra era: %s", palavraEscolhida);
        in.close();


    }

    public static void exercicio5Correcao() {

        Scanner sc = new Scanner(System.in);
        String[] palavra = {"C", "E", "L", "U", "L", "A", "R"};
        String[] descoberto = {" _ ", " _ ", " _ ", " _ ", " _ ", " _ ", " _ "};
        List<String> letrasEscolhidas = new ArrayList<>();
        int totalAcertos = 0;
        int tentativas = 10;
        System.out.println("Bem vindo ao JOGO DA FORCA!");
        while (tentativas > 0) {
            System.out.println("\nDigite uma letra: ");
            String letra = sc.next().toUpperCase().trim();
            int acertos = 0;
            letrasEscolhidas.add(letra);
            for (int i = 0; i < palavra.length; i++) {
                if (letra.equals(palavra[i])) {
                    descoberto[i] = letra;
                    acertos++;
                    totalAcertos++;
                }
            }
            System.out.println("");
            for (String l : descoberto) {
                System.out.print(l + " ");
            }
            if (totalAcertos == 7) {
                System.out.println("\nParabéns! Você acertou a palavra!");
                break;
            }
            if (acertos > 0) {
                System.out.printf("\nVocê teve %d acerto(s)!\n", acertos);
            } else {
                System.out.printf("\nA letra %s não faz parte da palavra!", letra);
                tentativas--;
            }
            System.out.printf("\nVocê ainda tem %d tentativa(s)!", tentativas);
            System.out.println("\nLetras que já foram escolhidas: ");
            System.out.println(letrasEscolhidas);
            System.out.println("\n*********************************");
        }
        sc.close();
    }
}





