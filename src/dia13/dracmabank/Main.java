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

        Conta novaConta = new Conta(500, novoCliente);
        novaConta.depositar(500);
        novaConta.sacar(250);
        novaConta.mostrarExtrato();
        novaConta.sacar(752);





    }
}
