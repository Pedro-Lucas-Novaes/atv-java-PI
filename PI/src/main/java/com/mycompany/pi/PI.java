/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pi;

/**
 *
 * @author fatec-dsm2
 */
public class PI {

    public static void main(String[] args) {
        projeto pjt = new projeto("AURA","Sistema desenvolvido para apoiar a realizacao de revisoes sistematicas utilizando tecnicas "
                + "de Processamento de Linguagem Natural (PLN). Ele visa otimizar e automatizar etapas como busca, triagem e analise de "
                + "publicacoes cientificas, tornando o processo mais eficiente e inteligente.","Estudantes da Fatec de Registro","Oferecer uma "
                + "ferramenta tecnologica que auxilie os estudantes na conducao de revisoes sistematicas, reduzindo o esforco manual, "
                + "aumentando a precisao na selecao de artigos relevantes e promovendo a qualidade da producao cientifica academica.");
        pjt.exibir();
    }
}

