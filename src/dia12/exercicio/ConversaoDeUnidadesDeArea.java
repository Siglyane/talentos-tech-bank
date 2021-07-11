package dia12.exercicio;

public class ConversaoDeUnidadesDeArea {
    //Taxas de conversão
    public static final double taxaEntreMetrosEhPes = 10.76;
    public static final double taxaEntrePesEhCentimetros = 926;
    public static final double taxaEntreMilhasEhAcres = 640;
    public static final double taxaEntreAcreEhPes = 43_560;


    public static double metrosParaPes(double metros) {
        return metros* taxaEntreMetrosEhPes;
    }

    public static double pesParaMetros(double pes) {
        return pes/ taxaEntreMetrosEhPes;
    }

    public static double pesParaCentimetros(double pes) {
        return pes* taxaEntrePesEhCentimetros;
    }

    public static double centimetrosParaPes(double centimetros) {
        return centimetros/ taxaEntrePesEhCentimetros;
    }

    public static double milhasParaAcre(double milhas) {
        return milhas* taxaEntreMilhasEhAcres;
    }

    public static double acreParaMilhas(double acres) {
        return acres/ taxaEntreMilhasEhAcres;
    }

    public static double acreParaPes(double acres) {
        return acres* taxaEntreAcreEhPes;
    }

    public static double pesParaAcre(double pes) {
        return pes/ taxaEntreAcreEhPes;
    }

    public static void main(String[] args) {
        System.out.println(acreParaPes(1));
    }
}
