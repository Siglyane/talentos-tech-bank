package dia8.exercicios.agenda;


import java.time.Year;
import java.util.Objects;

public class Pessoa {
//    Crie uma classe para representar uma pessoa, com os atributos de nome, ano de nascimento e altura.
//    Crie e também um método para imprimir todos dados de uma pessoa. Crie um método para mostrar quantos anos a pessoa
//    fará/terá neste ano.

    private String nome;

    private Integer anoDeNascimento;

    private Double altura;

    private String numeroDeCelular;

    public Pessoa(String nome, Integer anoDeNascimento, Double altura, String numeroDeCelular) {


        this.setNome(nome);
        this.setAnoDeNascimento(anoDeNascimento);
        this.setAltura(altura);
        this.setNumeroDeCelular(numeroDeCelular);

    }

    public String getNumeroDeCelular() {
        return numeroDeCelular;
    }

    public void setNumeroDeCelular(String numeroDeCelular) {
        this.numeroDeCelular = numeroDeCelular;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(Integer anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + this.getNome() + '\'' +
                ", anoDeNascimento=" + this.getAnoDeNascimento() +
                ", altura=" + this.getAltura() +
                ", numeroDeCelular='" + this.getNumeroDeCelular() + '\'' +
                '}';
    }

//     Outra forma de imprimir, lembrando que o print chama o toString.

    public void imprimirDadosDaPessoa() {
        System.out.println(this);
    }

    public void mostrarQuantosAnosAhPessoaTeraNoAnoCorrente() {
        if (this.getAnoDeNascimento() == null) {
            System.out.println("Ano de nascimento não informado");
            return;
        }


        Integer anoAtual = Year.now().getValue();
        Integer idadeQueAhPessoaTera = anoAtual - this.getAnoDeNascimento();
        System.out.println(idadeQueAhPessoaTera);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(getNome(), pessoa.getNome()) && Objects.equals(getAnoDeNascimento(), pessoa.getAnoDeNascimento()) &&
                Objects.equals(getAltura(), pessoa.getAltura()) && Objects.equals(getNumeroDeCelular(), pessoa.getNumeroDeCelular());
    }

    @Override
        public int hashCode() {
            return Objects.hash(getNome(), getNumeroDeCelular());
        }








}
