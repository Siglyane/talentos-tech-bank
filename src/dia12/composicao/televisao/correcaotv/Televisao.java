package dia12.composicao.televisao.correcaotv;

public class Televisao {

    private Integer volumeAtual = 15;

    private Integer canal = 13; //GLOBO

    public void ajustarVolume(Integer volume) {
        if (volume == -1) {
            this.diminuirVolume();
        } else if (volume == 1){
            this.aumentarVolume();
        }
    }


    private void aumentarVolume() {

        if (this.volumeAtual == 50) {
            return;
        }
        this.volumeAtual++;
    }

    private void diminuirVolume() {

        if (this.volumeAtual == 0) {
            return;
        }
        this.volumeAtual--;
    }

    public void aumentarCanal() {
        if (this.canal == 100) {
            this.canal = 0;
        } else {
            this.canal++;

        }
    }

    public void diminuirCanal() {
        if (this.canal == 1) {
            this.canal = 100;
        } else {
            this.canal--;
        }
    }

    // A responsabilidade fica para a televisão e não para o controle remoto, pois é ela que processa a informação
    // e caso tivermos diferentes tv o controle iria necessitar diversos if para conseguir saber como lidar com cada tv.
    public void trocarParaUmCanalIndicado(Integer canal) {
        if (canal < 1 || canal > 100) {
            return;
        }
        this.canal = canal;
    }

    public void informacoesDeSomEhDeCanal() {
        System.out.printf("A TV está no canal %d\n", this.canal);
        System.out.printf("A TV está com o volume de %d\n", this.volumeAtual);

    }

}
