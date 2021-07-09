package dia8;

public class Caneta {
    String cor;

    String tubo;

    String ponteira;

    String carga;

    Double tamanhoDaCaneta;

    Double quantidadeTinta = 0.5;

    Double peso;

    private Integer anoPatente = 1923;

    @Override
    public String toString() {
        return "OrientacaoObjetos{" +
                "cor='" + cor + '\'' +
                ", tubo='" + tubo + '\'' +
                ", ponteira='" + ponteira + '\'' +
                ", carga='" + carga + '\'' +
                ", tamanhoDaCaneta=" + tamanhoDaCaneta +
                ", quantidadeTinta=" + quantidadeTinta +
                ", peso=" + peso +
                '}';
    }

    public void imprimiQuantidadeDeTinta() {
        System.out.println("Quantidade de tinta = " + this.quantidadeTinta);
    }


}
