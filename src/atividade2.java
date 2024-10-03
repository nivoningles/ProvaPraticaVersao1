import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeVotantes;
        int votosTaffe = 0;
        int votosRodrigo = 0;
        int votosLucas = 0;
        int votosAlessandro = 0;

        System.out.print("\n** ELEIÇÃO 2024 COMO MELHOR PROFESSOR **\n");
        System.out.print("\nInformar quantidade de votantes: ");
        quantidadeVotantes = sc.nextInt();

        for (int i = 0; i < quantidadeVotantes; i++) {
            System.out.print("\n** AQUI ESTÃO NOSSOS CANDIDATOS **\n");
            System.out.println("99 - Taffe");
            System.out.println("88 - Rodrigo");
            System.out.println("77 - Lucas");
            System.out.println("66 - Alessandro");
            System.out.print("\nDigite o número do seu candidato: ");
            int voto = sc.nextInt();


            while (voto != 66 && voto != 77 && voto != 88 && voto != 99) {
                System.out.print("Número inválido, informe o número correto do seu candidato: ");
                voto = sc.nextInt();
            }


            if (voto == 66) {
                votosAlessandro++;
            } else if (voto == 77) {
                votosLucas++;
            } else if (voto == 88) {
                votosRodrigo++;
            } else if (voto == 99) {
                votosTaffe++;
            }
        }


        if (votosTaffe > votosRodrigo && votosTaffe > votosAlessandro && votosTaffe > votosLucas) {
            System.out.println("Taffe foi quem ganhou a eleição.");
        } else if (votosRodrigo > votosTaffe && votosRodrigo > votosLucas && votosRodrigo > votosAlessandro) {
            System.out.println("Rodrigo foi quem ganhou a eleição.");
        } else if (votosLucas > votosTaffe && votosLucas > votosRodrigo && votosLucas > votosAlessandro) {
            System.out.println("Lucas foi quem ganhou a eleição.");
        } else if (votosAlessandro > votosTaffe && votosAlessandro > votosLucas && votosAlessandro > votosRodrigo) {
            System.out.println("Alessandro foi quem ganhou a eleição.");
        } else {

            if (votosTaffe == votosRodrigo && votosTaffe == votosLucas && votosTaffe > votosAlessandro) {
                System.out.println("Empate entre Taffe, Rodrigo e Lucas.");
            } else if (votosTaffe == votosRodrigo && votosTaffe == votosAlessandro && votosTaffe > votosLucas) {
                System.out.println("Empate entre Taffe, Rodrigo e Alessandro.");
            } else if (votosTaffe == votosLucas && votosTaffe == votosAlessandro && votosTaffe > votosRodrigo) {
                System.out.println("Empate entre Taffe, Lucas e Alessandro.");
            } else if (votosRodrigo == votosLucas && votosRodrigo == votosAlessandro && votosRodrigo > votosTaffe) {
                System.out.println("Empate entre Rodrigo, Lucas e Alessandro.");
            } else if (votosTaffe == votosRodrigo && votosTaffe == votosLucas && votosTaffe == votosAlessandro) {
                System.out.println("Empate geral entre todos os candidatos.");
            } else {

                if (votosTaffe == votosRodrigo && votosTaffe > votosLucas && votosTaffe > votosAlessandro) {
                    System.out.println("Empate entre Taffe e Rodrigo.");
                } else if (votosLucas == votosAlessandro && votosLucas > votosTaffe && votosLucas > votosRodrigo) {
                    System.out.println("Empate entre Lucas e Alessandro.");
                } else if (votosTaffe == votosLucas && votosTaffe > votosRodrigo && votosTaffe > votosAlessandro) {
                    System.out.println("Empate entre Taffe e Lucas.");
                } else if (votosTaffe == votosAlessandro && votosTaffe > votosRodrigo && votosTaffe > votosLucas) {
                    System.out.println("Empate entre Taffe e Alessandro.");
                } else if (votosRodrigo == votosLucas && votosRodrigo > votosTaffe && votosRodrigo > votosAlessandro) {
                    System.out.println("Empate entre Rodrigo e Lucas.");
                }
            }
        }
    }
}