import java.text.DecimalFormat;
import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int quantidadeFilmes = 0;
        int numeroDoFilme = 0;
        int filmesBons = 0;
        int filmesRuins = 0;
        Double mediaDasNotasFilmes = 0.0;
        Double[] notaDosFilmes= new Double[0];
        Double somaDasNotas = 0.0;
        String mediaFormatado = "";

        System.out.print("\n** CADASTRO DE AVALIAÇÕES **\n");
        System.out.print("\nInformar quantidade de Filmes: ");
        quantidadeFilmes = sc.nextInt();
        notaDosFilmes = new Double[quantidadeFilmes];

        for (int i = 0; i < quantidadeFilmes ; i++) {
            numeroDoFilme++;
            System.out.print("Informe a nota de 0 a 10 do filme " + numeroDoFilme + ": ");
            notaDosFilmes[i] = sc.nextDouble();
            if (notaDosFilmes[i] < 6 && notaDosFilmes[i] > 0) {
                filmesRuins++;
            } else if (notaDosFilmes[i] >= 6 && notaDosFilmes[i] <= 10) {
                filmesBons++;
            } else if (notaDosFilmes[i] > 10 || notaDosFilmes[i] < 0) {
                do {
                    System.out.print("Número invalido, informe um valor de nota entre 0 e 10 do filme "+numeroDoFilme+": ");
                    notaDosFilmes[i] = sc.nextDouble();
                } while (notaDosFilmes[i] > 10);

                if (notaDosFilmes[i] < 6) {
                    filmesRuins++;
                } else if (notaDosFilmes[i] >= 6 && notaDosFilmes[i] <= 10) {
                    filmesBons++;
                }
            }
            somaDasNotas = somaDasNotas + notaDosFilmes[i];
        }
        mediaDasNotasFilmes = somaDasNotas / quantidadeFilmes;
        mediaFormatado = df.format(mediaDasNotasFilmes);
        System.out.println("\nA média dos Filmes foram "+mediaFormatado +"\nTiveram "+ filmesBons +" Filmes Bons\nTiveram "+ filmesRuins+" Filmes Ruins");
    }
}
