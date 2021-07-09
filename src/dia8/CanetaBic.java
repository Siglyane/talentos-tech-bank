package dia8;

public class CanetaBic extends Caneta{

    String tampaTraseira;

    CanetaBic() {
        this.tubo = "Transparente";
        this.quantidadeTinta = 1.0;
    }

    @Override
    public String toString() {
        return "CanetaBic{" +
                "tampaTraseira='" + tampaTraseira + '\'' +
                '}' + super.toString();
    }
}
