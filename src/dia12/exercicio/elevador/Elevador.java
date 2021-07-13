package dia12.exercicio.elevador;

public class Elevador {
//    1. Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio.
//    A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo),
//    capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também disponibilizar os seguintes métodos:
// - Inicializa : que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
//- Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
//- Sai : para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
//- Sobe : para subir um andar (não deve subir se já estiver no último andar);
//- Desce : para descer um andar (não deve descer se já estiver no térreo);
    Integer andarAtual = 0;
    Integer totalDeAndares;
    Integer capacidadeTotal;
    Integer pessoasAhBordo = 0;

    public Elevador(Integer totalDeAndares, Integer capacidadeTotal) {

        this.totalDeAndares = totalDeAndares - 1;
        this.capacidadeTotal = capacidadeTotal;

    }

    public void entra() {
        if (pessoasAhBordo >= capacidadeTotal) {
            System.out.println("O elevador está cheio");
            return;
        }
        this.pessoasAhBordo++;
    }
    public void sai() {
        if (pessoasAhBordo > 0) {
            this.pessoasAhBordo--;
            return;
        }
        System.out.println("Não há ninguém a bordo");
    }

    public void sobe() {
        if (andarAtual == totalDeAndares) {
            System.out.println("Você está no último andar.");
            return;
        }
        this.andarAtual++;
    }

    public void desce() {
        if (andarAtual == 0) {
            System.out.println("Você está no térreo");
            return;
        }
        andarAtual--;
    }
}
