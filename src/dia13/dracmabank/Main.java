package dia13.dracmabank;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Informe seu nome completo");
        String nome = in.next();
        System.out.println("Informe seu cpf");
        String cpf = in.next();

        Cliente novoCliente = new Cliente(nome, cpf);
        System.out.println("Escolha um tipo de conta: [1] - Conta Corrente [2] - Conta Poupança");
        int tipoDeConta = in.nextInt();
        System.out.printf("Informe o saldo inicial: ");
        double saldoInicial = in.nextDouble();
        // Caso queira adicionar outros tipos de conta futuramente
        Conta novaConta = null;
        switch (tipoDeConta) {
            case 1:
                novaConta = new ContaCorrente(saldoInicial, novoCliente);
                break;
            case 2:
                novaConta = new ContaPoupanca(saldoInicial, novoCliente);
                break;
            default:
                System.out.println("Opção inválida");
        }

        boolean realizarOperacao = true;
        while (realizarOperacao) {
            System.out.println("Qual operação você deseja realizar?");
            System.out.println("[1] - Sacar");
            System.out.println("[2] - Depositar");
            System.out.println("[3] - Extrato");
            System.out.println("[4] - Encerrar Conta");
            if (novaConta instanceof ContaCorrente) {
                System.out.println("[5] - Solicitar Cheque Especial");
            }
            System.out.println("[0] - Sair");
            int opcaoSelecionada = in.nextInt();
            switch (opcaoSelecionada) {
                case 1:
                    System.out.print("Informe o valor a sacar: ");
                    double saque = in.nextDouble();
                    novaConta.sacar(saque);
                    break;
                case 2:
                    System.out.print("Informe o valor a depositar: ");
                    double deposito = in.nextDouble();
                    novaConta.depositar(deposito);
                    break;
                case 3:
                    novaConta.mostrarExtrato();
                    break;
                case 4:
                    novaConta.encerrarConta();
                    break;
                case 5:
                    if (novaConta instanceof ContaCorrente) {
                        System.out.print("Informe o limite do cheque especial: ");
                        double limiteChequeEspecial = in.nextDouble();
                        System.out.print("\nSenha do Gerente:");
                        int senhaInformada = in.nextInt();
                        novaConta.adicionarLimiteChequeEspecial(limiteChequeEspecial, senhaInformada);
                    } else {
                        System.out.println("Essa opção não é válida para Conta Poupança");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    realizarOperacao = false;
                    break;
                default:
                    System.out.println("Você selecionou uma opção inválida");

            }
        }


    }
}
