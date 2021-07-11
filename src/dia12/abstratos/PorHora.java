package dia12.abstratos;

public final class PorHora extends Empregado {

    private double valor;
    private int horas;

    public PorHora(String nome, double valor, int horas) {
        super(nome);
        this.valor = valor;
        this.horas = horas;
    }

    @Override
    public double ganha() {
        if (this.horas >= 0) {
            return this.horas <= 300 ? this.horas * this.valor : 300*this.valor;
        } else {
            return 0;
        }
    }
}