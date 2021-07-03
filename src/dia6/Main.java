package dia6;

public class Main {
    public static void main(String[] args) {

//        double saldoConta1 = 10;
        // Para não criar diversas variáveis podemos usar o array:

//        double[] saldos = new double[10];
//        saldos[0] = 10;
//        saldos[1] = 20;
//        saldos[2] = 30;
//        //...
//        saldos[9] = 100;

        // segundo forma de estanciar
         double[] saldos = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

         for (int i = 0; i < saldos.length; i++) {
             System.out.println(saldos[i]);
         }

        // [10, 20, 30, 40] vai de 0 até n - 1
    }
}
