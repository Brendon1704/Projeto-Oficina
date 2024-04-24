import java.util.Scanner;

public class BigBrotherEliminationArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de candidatos: ");
        int numCandidates = scanner.nextInt();

        // Criar arrays para armazenar os nomes e votos dos candidatos
        String[] candidateNames = new String[numCandidates];
        int[] candidateVotes = new int[numCandidates];

        // Entrada dos nomes e votos dos candidatos
        for (int i = 0; i < numCandidates; i++) {
            scanner.nextLine(); // Consumir a quebra de linha
            System.out.print("Digite o nome do candidato " + (i + 1) + ": ");
            candidateNames[i] = scanner.nextLine();
            System.out.print("Digite o número de votos para " + candidateNames[i] + ": ");
            candidateVotes[i] = scanner.nextInt();
        }

        // Encontrar o candidato com mais votos
        int maxVotes = Integer.MIN_VALUE;
        int eliminatedIndex = -1;

        for (int i = 0; i < numCandidates; i++) {
            if (candidateVotes[i] > maxVotes) {
                maxVotes = candidateVotes[i];
                eliminatedIndex = i;
            }
        }

        // Imprimir o candidato eliminado
        System.out.println("O candidato com mais votos (" + maxVotes + " votos) foi " + candidateNames[eliminatedIndex] + ".");
        System.out.println("Esse candidato está eliminado do Big Brother Brasil!");
    }
}
