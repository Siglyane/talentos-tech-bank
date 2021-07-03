package dia6;

import java.util.Arrays;
import java.util.Random;

public class Exercicios {
    public static void main(String[] args) {
        int[] vetor = {50, 30, 25, 80, 54, 541, 25, 26};
        selectionSort(vetor);
        System.out.println(Arrays.toString(vetor));

        int[] arr = {50, 30, 25, 80, 54, 541, 25, 26};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        sortString();


    }


    public static void exercicio1() {
        // Dado um array com 20 números, imprima seus valores de trás para frente.
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }


    public static void exercicio2() {

        //@autor: Grupo 1 - Rafaela Siglyane, Giovanna, Carolina Alves, Victor, Gisele
        Random r = new Random();
//        int[] arrayDesordenado = {-15, 98, 35, 7, 18, 0, 543, 35, 15, 2, -11};
        int[] arrayDesordenado = new int[10];
        int[] arrayOrdenador = new int[arrayDesordenado.length];
        for (int i = 0; i < arrayDesordenado.length; i++) {
            arrayDesordenado[i] = r.nextInt(100);
        }
        for (int j = 0; j < arrayOrdenador.length; j++) {
            int valorMinimo = arrayDesordenado[j];
            for (int i = j; i < arrayDesordenado.length; i++) {
                if (arrayOrdenador[j] > arrayDesordenado[i]) {
                    int aux = valorMinimo;
                    valorMinimo = arrayDesordenado[i];
                    arrayDesordenado[i] = aux;

                }
                arrayOrdenador[j] = valorMinimo;
            }
        }
//        for (int number: arrayOrdenador) {
//            System.out.print(String.format("%d ", number));;
//        }

        // Outra forma de print array
        System.out.println(Arrays.toString(arrayOrdenador));
    }


    public static void selectionSort(int[] vetor) {
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            int indice_com_menor_valor = i;

            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[indice_com_menor_valor]) {
                    indice_com_menor_valor = j;
                }
            }

            int temporaria = vetor[indice_com_menor_valor];
            vetor[indice_com_menor_valor] = vetor[i];
            vetor[i] = temporaria;


        }

    }


    public static void bubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }

    public static void sortString() {
        String[] palavras = {"Banana", "Maça", "Uva", "Amora", "Ameixa"};

        System.out.println(Arrays.toString(palavras));

        Arrays.sort(palavras);
        System.out.println(Arrays.toString(palavras));
    }


}


