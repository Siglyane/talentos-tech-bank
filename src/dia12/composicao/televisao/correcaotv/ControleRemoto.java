package dia12.composicao.televisao.correcaotv;

public class ControleRemoto {

    private Televisao televisao;

    public void setTelevisao(Televisao televisao) {
        this.televisao = televisao;
    }


    // Usando métodos do controle remoto e ENCAPSULANDO os métodos da televisão
    public void aumentarVolume() {
        this.televisao.ajustarVolume(1);
    }

    public void diminuirVolume() {
        this.televisao.ajustarVolume(-1);
    }

    public void aumentarCanal() {
        this.televisao.aumentarCanal();
    }

    public void diminuirCanal() {
        this.televisao.diminuirCanal();
    }

    // A responsabilidade fica para a televisão e não para o controle remoto, pois é ela que processa a informação
    // e caso tivermos diferentes tv o controle iria necessitar diversos if para conseguir saber como lidar com cada tv.
    public void trocarParaUmCanalIndicado(Integer canal) {
        this.televisao.trocarParaUmCanalIndicado(canal);
    }

    public void informacoesDeSomEhDeCanal() {
        this.televisao.informacoesDeSomEhDeCanal();
    }

    public static void main(String[] args) {
        Televisao samsung = new Televisao();
        Televisao lg = new Televisao();

        ControleRemoto controleRemoto = new ControleRemoto();
        System.out.println("----------------SAMSUNG----------------");
        controleRemoto.setTelevisao(samsung);


        controleRemoto.aumentarVolume();
        controleRemoto.informacoesDeSomEhDeCanal();

        controleRemoto.diminuirCanal();
        controleRemoto.informacoesDeSomEhDeCanal();

        controleRemoto.trocarParaUmCanalIndicado(11);
        controleRemoto.informacoesDeSomEhDeCanal();

        System.out.println("----------------LG----------------");

        controleRemoto.setTelevisao(lg);
        controleRemoto.informacoesDeSomEhDeCanal();


        controleRemoto.diminuirVolume();
        controleRemoto.aumentarCanal();
        controleRemoto.informacoesDeSomEhDeCanal();

        System.out.println("---Vendo as informações pela própria TV---");
        samsung.informacoesDeSomEhDeCanal();
        lg.informacoesDeSomEhDeCanal();



    }
}
