package dia12.interfaces.formas;

public class Ponto implements FormasGeometricas {

    private double cordX;

    private double cordY;

    public Ponto(double cordX, double cordY) {
        this.cordX = cordX;
        this.cordY = cordY;
    }


    @Override
    public String forma() {
        return "Ponto: (" + cordX + ", " + cordY + ")";
    }

    @Override
    public void mostrar() {
        System.out.println(forma());
    }
}
