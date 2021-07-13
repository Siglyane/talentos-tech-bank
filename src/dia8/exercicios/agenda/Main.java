package dia8.exercicios.agenda;

import java.util.Scanner;

public class Main {

    public static void exercicio1() {
        Pessoa pessoa = new Pessoa("Rafaela Dartora", 1994, 16.9, "982115839");
        pessoa.mostrarQuantosAnosAhPessoaTeraNoAnoCorrente();
        pessoa.imprimirDadosDaPessoa();
        pessoa.mostrarQuantosAnosAhPessoaTeraNoAnoCorrente();

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useDelimiter("\n");

        Agenda agenda = new Agenda();

        System.out.println("Bem vindo a sua agenda");

        boolean programaEmExecução = true;

        while (programaEmExecução) {

            System.out.println("Escolha uma das opções: ");
            System.out.println("(1) - Adicionar novo contato");
            System.out.println("(2) - Remover contato");
            System.out.println("(3) - Buscar pessoa pelo nome");
            System.out.println("(4) - Mostrar todos os contatos");
            System.out.println("(0) Para sair");

            Short opcao = in.nextShort();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do contato");
                    String nome = in.next();

                    System.out.println("Digite o ano de nascimento");
                    Integer anoDeNascimento = in.nextInt();

                    System.out.println("Digite a altura");
                    Double altura = in.nextDouble();

                    System.out.println("Digite o número de celular");
                    String numeroDoCelular = in.next();

                    System.out.println("----------------------");
                    agenda.armazenaPessoa(nome, anoDeNascimento, altura, numeroDoCelular);
                    break;
                case 2:
                    System.out.println("Digite o nome do contato para remover");
                    String nomeParaRemover = in.next();

                    System.out.println("Digite o número do celular para remover");
                    String numeroDoCelularParaRemover = in.next();

                    agenda.removePessoa(nomeParaRemover, numeroDoCelularParaRemover);

                    break;
                case 3:
                    System.out.println("Digite o nome do contato para buscar");
                    String nomeParaBuscar = in.next();

                    System.out.println("-----------------------");
                    agenda.listaBuscaDePessoasPeloNome(nomeParaBuscar);
                    System.out.println("-----------------------");

                    break;
                case 4:
                    System.out.println("----------------------");
                    agenda.imprimeAgenda();

                    break;
                case 0:
                    programaEmExecução = false;
                    break;
            }

        }

        in.close();
    }
}
