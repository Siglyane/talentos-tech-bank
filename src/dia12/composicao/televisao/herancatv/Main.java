package dia12.composicao.televisao.herancatv;

//Não é o ideal usar herança pois o controle não É UM TIPO TELEVISAO, mas possui uma TV.
//Por isso ele pode trabalhar com outras televisões, tornando composição uma opção melhor.
public class Main {
    public static void main(String[] args) {
        ControleRemoto samsung = new ControleRemoto(10, "Samsung B250");
        samsung.verificarCanal();
        samsung.aumentarCanal();
        samsung.verificarCanal();
    }
}
