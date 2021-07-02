package dia2;

public class Main {
    public static void main(String[] args) {
        operadores();
    }

    public static void operadores() {
        // Atribuição
        int idade = 20;
        int i = 1 + 1;

        System.out.println(10.0 / 3.0);
        System.out.println(10 % 3);

        boolean operadorRelacional = 1 != 2; // ==, !=, >, <, >=, <=

        // operadores Lógicos

        boolean testeLogico = 1 == 1 && 2 == 2;

        boolean invertido = !true;

    }

    public static void primeiroIf() {
        int idade = 155;

        if (idade < 0 || idade >= 150) {
            System.out.println("Idade inválida");
        } else if (idade >= 18) {
            System.out.println("Você tem permissão para assistir esse conteúdo");
        } else {
            System.out.println("Você não possui permissão para assistir esse conteúdo");
        }
    }

    public static void ifSemFechaChaves() {
        // O if sem {} executa somente a primeira linha logo após ele mesmo
        if (1 > 0)
            System.out.println("Um é maior que zero");
        System.out.println("Não continua dentro do if");
    }
}
