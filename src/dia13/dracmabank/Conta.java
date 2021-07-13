package dia13.dracmabank;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Conta {

    private double saldo = 0;
    private int numeroDaConta;
    private boolean statusDaConta = true;
    private List<String> extrato = new ArrayList<>();

    private Cliente cliente;

    public Conta(double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.numeroDaConta = (int) ((Math.random() * (9999-1000)) + 1000);
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
            this.saldo -= valorDoSaque;
            System.out.printf("Saldo atual: R$ %.2f \n", saldo);
            String auxiliar = "Saque: R$ " + valorDoSaque;
            extrato.add(auxiliar);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar(double valorDoDeposito) {
        this.saldo += valorDoDeposito;
        System.out.printf("Saldo atual: R$ %.2f \n", saldo);
        String auxiliar = "Deposito: R$ " + valorDoDeposito;
        extrato.add(auxiliar);
    }

    public void encerrarConta() {
        if (statusDaConta) {
            if (saldo > 0) {
                System.out.println("Você deve sacar o saldo para encerrar a conta");
            } else {
                statusDaConta = false;
                System.out.println("Conta encerrada");
            }
        } else {
            System.out.println("Esta conta já foi encerrada");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
