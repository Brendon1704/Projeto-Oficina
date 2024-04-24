import java.util.ArrayList;
import java.util.Scanner;

class Candidato {
    private String nome;
    private int votos;

    public Candidato(String nome) {
        this.nome = nome;
        this.votos = 3;
    }

    public String getNome() {
        return nome;
    }

    public int getVotos() {
        return votos;
    }

    public void adicionarVoto() {
        votos++;
    }
}

class Programa {
    private ArrayList<Candidato> candidatos;

    public Programa() {
        candidatos = new ArrayList<>();
    }

    public void adicionarCandidato(Candidato candidato) {
        candidatos.add(candidato);
    }

    public void registrarVoto(String nomeCandidato) {
        for (Candidato candidato : candidatos) {
            if (candidato.getNome().equals(nomeCandidato)) {
                candidato.adicionarVoto();
                break;
            }
        }
    }

    public void eliminarCandidato() {
        Candidato candidatoEliminado = null;
        int maxVotos = Integer.MIN_VALUE;

        for (Candidato candidato : candidatos) {
            if (candidato.getVotos() > maxVotos) {
                maxVotos = candidato.getVotos();
                candidatoEliminado = candidato;
            }
        }

        if (candidatoEliminado != null) {
            System.out.println("O candidato " + candidatoEliminado.getNome() + " foi eliminado com " + candidatoEliminado.getVotos() + " votos.");
            candidatos.remove(candidatoEliminado);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Programa programa = new Programa();
        Scanner scanner = new Scanner(System.in);

        Candidato c1 = new Candidato("João");
        Candidato c2 = new Candidato("Maria");
        Candidato c3 = new Candidato("Pedro");

        programa.adicionarCandidato(c1);
        programa.adicionarCandidato(c2);
        programa.adicionarCandidato(c3);

        System.out.println("Digite o nome do candidato que você quer votar (João, Maria ou Pedro):");
        String nomeVoto = scanner.nextLine();
        programa.registrarVoto(nomeVoto);

        System.out.println("Digite o nome do candidato que você quer votar (João, Maria ou Pedro):");
        nomeVoto = scanner.nextLine();
        programa.registrarVoto(nomeVoto);

        System.out.println("Digite o nome do candidato que você quer votar (João, Maria ou Pedro):");
        nomeVoto = scanner.nextLine();
        programa.registrarVoto(nomeVoto);

        programa.eliminarCandidato();
    }
}
