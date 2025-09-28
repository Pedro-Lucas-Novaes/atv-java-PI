package atvPi;

import java.util.ArrayList;

public class Ods {
    private String agenda;
    private ArrayList<String> odsList = new ArrayList<>();

    public Ods(String agenda, String... odsIniciais) {
        this.agenda = agenda;
        for (String o : odsIniciais) {
            odsList.add(o);
        }
    }

    public void adicionarODS(String novaOds) {
        odsList.add(novaOds);
    }

    public void exibir() {
        System.out.println("\nAgenda 2030 da ONU - " + this.agenda);
        for (int i = 0; i < odsList.size(); i++) {
            System.out.println("ODS " + (i + 1) + ": " + odsList.get(i));
        }
    }
}
