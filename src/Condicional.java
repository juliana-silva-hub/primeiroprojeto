public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1986;
        boolean incluidoNoPlano = true;
        double notaDeFilme = 8.1;
        String tipoPlano = "plus";

        if(anoDeLancamento >= 2023) {
            System.out.println("Lançamento");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if(incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Pagar a locação");
        }
    }
}
