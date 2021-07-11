package dia12.sobrecarga;

public class Main {

    public static void main(String[] args) {
        MinhaLista minhaLista = new MinhaLista();
        minhaLista.add(1); // Chama o metodo que usa o parametro int
        minhaLista.add("2"); // Chama o metodo que usa o parametro String
        minhaLista.add(3.0); // Chama o metodo que usa o parametro double
        minhaLista.add(4f); // Chama o metodo que usa o parametro float

        System.out.println(minhaLista);
    }
}
