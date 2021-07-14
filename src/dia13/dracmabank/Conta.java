package dia13.dracmabank;

import java.util.ArrayList;
import java.util.List;

public class Conta {

    protected double saldo = 0;
    private int numeroDaConta;
    private boolean statusDaConta = true;
    protected List<String> extrato = new ArrayList<>();

    private Cliente cliente;

    public Conta(double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.numeroDaConta = (int) ((Math.random() * (9999 - 1000)) + 1000);
        this.cliente = cliente;
    }

    public void mostrarExtrato() {
        System.out.println("----Extrato----");
        for (String operacao : extrato) {
            System.out.println(operacao);
        }
        System.out.printf("Seu saldo atual: R$ %.2f \n", saldo);
    }

    public void sacar(double valorDoSaque) {

        if (saldo >= valorDoSaque) {
            metodoDoSaque(valorDoSaque);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    protected void metodoDoSaque(double valorDoSaque) {
        this.saldo -= valorDoSaque;
        System.out.printf("Saldo atual: R$ %.2f \n", saldo);
        String auxiliar = "Saque: R$ " + valorDoSaque;
        extrato.add(auxiliar);
    }

    public void depositar(double valorDoDeposito) {
        this.saldo += valorDoDeposito;
        System.out.printf("Saldo atual: R$ %.2f \n", saldo);
        String auxiliar = "Deposito: R$ " + valorDoDeposito;
        extrato.add(auxiliar);
    }

    public void encerrarConta() {
        if (statusDaConta) {
            if (saldo != 0) {
                System.out.println("Para encerrar a conta, seu saldo deve ser R$ 0.00");
                System.out.printf("Seu saldo atual é: R$ %.2f\n", saldo);
            } else {
                statusDaConta = false;
                System.out.println("Conta encerrada");
                System.exit(1);
            }
        }
    }

    public void adicionarLimiteChequeEspecial(double valorChequeEspecial, int senhaDigitada) {

    }

}
