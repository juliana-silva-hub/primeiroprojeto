public class Main {
  
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2023;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDeFilme = 8.1;

        double media = (9.8 + 6.3 + 7.0) / 3;
        System.out.println("Média: " + media);
        String sinopse;
        sinopse = """
                Filme de aventura com galã dos anos 80.""";
        System.out.println("Sinopse : " + sinopse);

        int classificacao = (int) (media / 2);
        System.out.println("Classificação: " + classificacao);

    }
}