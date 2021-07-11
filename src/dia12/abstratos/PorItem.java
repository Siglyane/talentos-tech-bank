package dia12.abstratos;

public final class PorItem extends Empregado {

    private double remuneracaoPorProducao; // remuneração por produção
    private int quantidade; //produzido

    public PorItem(String nome, double remuneracaoPorProducao, int quantidade) {
        super(nome);
        this.remuneracaoPorProducao = remuneracaoPorProducao;
        this.quantidade = quantidade;
    }

    @Override
    public double ganha() {
        return remuneracaoPorProducao * quantidade;
    }
}
