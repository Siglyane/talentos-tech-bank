package dia12.exercicio.elevador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useDelimiter("\n");

        Elevador elevador = new Elevador(10, 6);

        boolean programaEmExecução = true;

        while (programaEmExecução) {

            System.out.println("Escolha uma das opções: ");
            System.out.println("(1) - Entrar no elevador");
            System.out.println("(2) - Sair no elevador");
            System.out.println("(3) - Subir");
            System.out.println("(4) - Descer");
            System.out.println("(0) Para sair do programa");

            Short opcao = in.nextShort();

            switch (opcao) {
                case 1:
                    elevador.entra();
                case 2:
                    elevador.sai();
                case 3:
                    elevador.sobe();
                case 4:
                    elevador.desce();
                case 0:
                    programaEmExecução = false;
            }


            in.close();
        }
    }
}
