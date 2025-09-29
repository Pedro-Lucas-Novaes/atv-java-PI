package atvPi;

import java.util.ArrayList;

public class equipe {
    private ArrayList<String> membros = new ArrayList<>();

    public equipe() {
        membros.add("Beatriz Hermenegildo Egen");
        membros.add("Danieli Fiel Reis");
        membros.add("Gabriela Pereira Lino");
        membros.add("Pedro Lucas de Novaes Dutra");
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
