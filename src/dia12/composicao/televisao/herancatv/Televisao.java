package dia12.composicao.televisao.herancatv;

public class Televisao {

    private String modelo;

    Integer canal;

    Integer volume;

    Televisao(Integer canal, String modelo) {
        this.canal = canal;
        this.modelo = modelo;
    }

    void aumentarVolume() {
        this.volume++;
    }

    void diminuirVolume() {
        this.volume--;
    }

    void aumentarCanal() {
        this.canal++;
    }

    void diminuirCanal() {
        this.canal--;
    }

    public void verificarVolume() {
        System.out.println(volume);
    }

    public void verificarCanal() {
        System.out.println(canal);
    }

}
