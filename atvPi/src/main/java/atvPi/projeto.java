package atvPi;

import java.util.ArrayList;

public class projeto {
    private String nome_projeto;
    private ArrayList<String> descricoes = new ArrayList<>();
    private String publico_projeto;
    private String objetivo_projeto;

    public projeto(String nome_projeto, String descricaoInicial, String publico_projeto, String objetivo_projeto) {
        this.nome_projeto = nome_projeto;
        this.descricoes.add(descricaoInicial);
        this.publico_projeto = publico_projeto;
        this.objetivo_projeto = objetivo_projeto;
    }

    public void adicionarDescricao(String novaDescricao) {
        descricoes.add(novaDescricao);
    }

    public void exibir() {
        System.out.println("\nNome do projeto: " + this.nome_projeto);
        System.out.println("Descrições do projeto:");
        for (String d : descricoes) {
            System.out.println("- " + d);
        }
        System.out.println("Publico-alvo do projeto: " + this.publico_projeto);
        System.out.println("Objetivo do projeto: " + this.objetivo_projeto);
    }
}
