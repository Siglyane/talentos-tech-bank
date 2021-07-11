package dia12.composicao.televisao.herancatv;

public class ControleRemoto extends Televisao{


    ControleRemoto(Integer canal, String modelo) {
        super(canal, modelo);
    }


    // Como pode existir diferentes formas de definir um canal conforme a tv e pode ter o mesmo controle para diferentes
    // tvs, o ideal é que fique dentro da classe tv.
    public void definirCanal(Integer canal) {
        super.canal = canal;
        System.out.println(canal);
    }
}
