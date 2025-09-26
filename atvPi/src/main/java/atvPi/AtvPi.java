package atvPi;

import java.util.Scanner;
import java.util.ArrayList;

public class AtvPi {
 
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       projeto pjt = new projeto("AURA","Sistema desenvolvido para apoiar a realizacao de revisoes sistematicas utilizando tecnicas "
                + "de Processamento de Linguagem Natural (PLN). Ele visa otimizar e automatizar etapas como busca, triagem e analise de "
                + "publicacoes cientificas, tornando o processo mais eficiente e inteligente.","Estudantes da Fatec de Registro","Oferecer uma "
                + "ferramenta tecnologica que auxilie os estudantes na conducao de revisoes sistematicas, reduzindo o esforco manual, "
                + "aumentando a precisao na selecao de artigos relevantes e promovendo a qualidade da producao cientifica academica."); 
        Ods.ODS ods = new Ods.ODS();
        equipe.Equipe equipe = new equipe.Equipe();
         
        

        int opcao;
        do {
             System.out.println("\n===== MENU DO PROJETO INTEGRADOR =====");
            System.out.println("1 - Apresentação do Projeto");
            System.out.println("2 - Cadastrar ODS Relacionados");
            System.out.println("3 - Cadastrar Equipe");
            System.out.println("4 - Mostrar Informações");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    pjt.exibir();
                    break;

                case 2:
                    ods.cadastrarODS(scanner);
                    break;

                case 3:
                    equipe.cadastrarEquipe(scanner);
                    break;

                case 4:
                    System.out.println("\n--- Informações do Projeto ---");

                    System.out.println("Apresentação: ");
                    pjt.exibir();
                    
                    System.out.println("\nODS Relacionados:");
                    if (ods.getODSRelacionados().isEmpty()) {
                        System.out.println("Nenhum ODS cadastrado.");
                    } else {
                        for (String o : ods.getODSRelacionados()) {
                            System.out.println("- " + o);
                        }
                    }

                    System.out.println("\nEquipe:");
                    if (equipe.getMembros().isEmpty()) {
                        System.out.println("Nenhum membro cadastrado.");
                    } else {
                        for (String membro : equipe.getMembros()) {
                            System.out.println("- " + membro);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
    
}

