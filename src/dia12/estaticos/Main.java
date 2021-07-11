package dia12.estaticos;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----PI-----");
        System.out.println(Exemplos.pi);

        Exemplos ex = new Exemplos();
        System.out.println("-----PI2-----");

        System.out.println(ex.pi2);

        ex.pi2 = 123.0;
        System.out.println("-----PI2-----");
        System.out.println(ex.pi2);

        Exemplos.pi = 999.0;

        System.out.println("-----PI-----");

        System.out.println(Exemplos.pi);

        Exemplos ex2 = new Exemplos();
        System.out.println("-----PI2-----");

        System.out.println(ex2.pi2);

        ex2.pi = 500.0;

        System.out.println("-----PI-----");

        System.out.println(ex2.pi);
        System.out.println(ex.pi);

        Matematica matematica = new Matematica();
        matematica.ah = 1;
        matematica.bh = 100;

        matematica.somaDeAhMaisBh();

        Matematica matematica1 = new Matematica();
        matematica1.somaDeAhMaisBh();

        Matematica.somaDeAhMaisBh(1, 99);



    }
}
