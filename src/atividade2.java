import java.text.DecimalFormat;
import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeVotantes = 0;
        int votosTaffe = 0;
        int votosRodrigo = 0;
        int votosLucas = 0;
        int votosAlessandro = 0;
        int[] votos = new int[0];

        System.out.print("\n** ELEIÇÃO 2024 COMO MELHOR PROFESSOR **\n");
        System.out.print("\nInformar quantidade de votantes: ");
        quantidadeVotantes = sc.nextInt();
        votos = new int[quantidadeVotantes];

        for (int i = 0; i < quantidadeVotantes; i++) {

            System.out.print("\n** AQUI ESTÃO NOSSOS CANDIDATOS **\n");
            System.out.println("99 - Taffe");
            System.out.println("88 - Rodrigo");
            System.out.println("77 - Lucas");
            System.out.println("66 - Alessandro");
            System.out.println("\nDigite o numero do seu candidato: ");
            votos[i] = sc.nextInt();
            while (votos[i] != 66 && votos[i] != 77 && votos[i] != 88 && votos[i] != 99){
                System.out.print("Número invalido, informe o numero correto do seu candidato: ");
                votos[i] = sc.nextInt();
            };

            if (votos[i] == 66) {
                votosAlessandro++;
            } else if (votos[i] == 77) {
                votosLucas++;
            } else if (votos[i] == 88) {
                votosRodrigo++;
            } else if (votos[i] == 99) {
                votosTaffe++;
            }

        }
        if (votosTaffe > votosRodrigo && votosTaffe > votosAlessandro && votosTaffe > votosLucas) {
            System.out.println("Taffe foi quem ganhou a eleição");
        } else if (votosRodrigo > votosTaffe && votosRodrigo > votosLucas && votosRodrigo > votosAlessandro) {
            System.out.println("Rodrigo foi quem ganhou a eleição");
        } else if (votosLucas > votosTaffe && votosLucas > votosRodrigo && votosLucas > votosAlessandro) {
            System.out.println("Lucas foi quem ganhou a eleição");
        } else if (votosAlessandro > votosTaffe && votosAlessandro > votosLucas && votosAlessandro > votosRodrigo) {
            System.out.println("Alessandro foi quem ganhou a eleição");
        } else if (votosTaffe == votosRodrigo && votosTaffe == votosAlessandro && votosTaffe == votosLucas) {
            System.out.println("Então deu empate de todos os candidatos");
        } else if (votosTaffe == votosRodrigo && votosTaffe < votosAlessandro && votosAlessandro == votosLucas) {
            System.out.println("Então deu empate entre Alessandro e Lucas");
        } else if (votosTaffe == votosRodrigo && votosTaffe > votosAlessandro && votosAlessandro == votosLucas) {
            System.out.println("Então deu empate entre Taffe e Rodrigo");
        } else if (votosTaffe == votosAlessandro && votosRodrigo > votosAlessandro && votosRodrigo == votosLucas) {
            System.out.println("Então deu empate entre Lucas e Rodrigo");
        } else if (votosTaffe == votosAlessandro && votosRodrigo < votosAlessandro && votosRodrigo == votosLucas) {
            System.out.println("Então deu empate entre Alessandro e Taffe");
        } else if (votosTaffe == votosLucas && votosTaffe < votosAlessandro && votosRodrigo == votosAlessandro) {
            System.out.println("Então deu empate entre Alessandro e Rodrigo");
        } else if (votosTaffe == votosLucas && votosTaffe > votosAlessandro && votosRodrigo == votosAlessandro) {
            System.out.println("Então deu empate entre Taffe e Lucas");

        }
    }
}