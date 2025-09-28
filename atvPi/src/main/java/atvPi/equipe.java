package atvPi;

import java.util.ArrayList;

public class equipe {
    private ArrayList<String> membros = new ArrayList<>();

    public equipe() {
        membros.add("Pedro Lucas de Novaes Dutra");
        membros.add("Gabriela Pereira Lino");
        membros.add("Danieli Fiel Reis");
        membros.add("Beatriz Hermenegildo Egen");
    }

    public void adicionarMembro(String nome) {
        membros.add(nome);
    }

    public void exibir() {
        System.out.println("\nMembros da Equipe:");
        for (String m : membros) {
            System.out.println("- " + m);
        }
    }
}
