package dia13.dracmabank;

public class ContaCorrente extends Conta{

    public ContaCorrente(double saldo, Cliente cliente) {
        super(saldo, cliente);
    }

    public void adicionarLimiteChequeEspecial() {

    }

    @Override
    public void encerrarConta() {
        super.encerrarConta(); //TODO cheque especial
    }
}
