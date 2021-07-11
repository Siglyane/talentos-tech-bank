package dia12.sobreposicao;

public class BemTeVi extends Ave {
    // Herda o metodo canta() da classe mãe Ave, porem por dar um @override irá usar a informação desse.
    @Override
    public void canta() {
        System.out.println("bem te vi");
    }

}