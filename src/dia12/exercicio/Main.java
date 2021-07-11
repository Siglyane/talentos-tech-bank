package dia12.exercicio;

public class Main {
    public static void main(String[] args) {
        System.out.println(ConversaoDeUnidadesDeArea.acreParaMilhas(1));
        System.out.println(ConversaoDeUnidadesDeArea.milhasParaAcre(1));
        System.out.println(ConversaoDeUnidadesDeArea.pesParaAcre(
            ConversaoDeUnidadesDeArea.acreParaPes(1)
        ));
    }

}
