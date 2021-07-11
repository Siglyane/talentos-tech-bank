package dia12.interfaces.automovel;

public interface Veiculo {

    default void metodoConcreto() {
        System.out.println("Método Concreto na Interface");
    }
}
