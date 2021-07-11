package dia12.estaticos;

public class Exemplos {

    // Não precisa estanciar, é da classe;
    static double pi = Math.PI;

//    Para não alterar o valor, este é o valor final
//    Por convenção quando é final o nome do atributo é em maiusculo.
//    static final double Pi = Math.PI;

    //Atributos do objeto
    double pi2 = Math.PI;

    static void helloStatic() {
//        this chama o valor desse objeto, enquanto helloStatic é um metodo estatico;
//        this.pi2;
        System.out.println("Hello world");
    }


}
