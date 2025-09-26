package atvPi;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ender
 */
public class projeto {
    private String nome_projeto;
    private String descricao_projeto;
    private String publico_projeto;
    private String objetivo_projeto;
    
    public projeto (String nome_projeto, String descricao_projeto, String publico_projeto, String objetivo_projeto){
        this.nome_projeto = nome_projeto;
        this.descricao_projeto = descricao_projeto;
        this.publico_projeto = publico_projeto;
        this.objetivo_projeto = objetivo_projeto;
    }
    
    public void exibir(){
        System.out.println("\nNome do projeto: " + this.nome_projeto);
        System.out.println("Descricao do projeto: " + this.descricao_projeto);
        System.out.println("Publico-alvo do projeto: " + this.publico_projeto);
        System.out.println("Objetivo do projeto: " + this.objetivo_projeto);
    }
}
