package dia12.sobrecarga;

import java.util.ArrayList;
import java.util.List;

public class MinhaLista {

    private List<Integer> meusNumeros = new ArrayList<>();

    // Mantém o mesmo nome, mas possui parametros diferentes, assim o metodo a ser chamado é determinado ao copilarmos
    public void add(Integer i) {
        this.meusNumeros.add(i);
    }

    public void add(String str) {
        this.meusNumeros.add(Integer.valueOf(str));
    }

    public void add(Double d) {
        this.meusNumeros.add(d.intValue());
    }

    public void add(Float f) {
        this.meusNumeros.add(f.intValue());
    }


    // TODO exemplos de sobrecarga com parametros iguais em ordens diferentes
    public void add(Float ff, Integer fff) {

    }

    public void add(Integer ff, Float fff) {

    }

    @Override
    public String toString() {
        return "MinhaLista{" +
                "meusNumeros=" + meusNumeros +
                '}';
    }


}