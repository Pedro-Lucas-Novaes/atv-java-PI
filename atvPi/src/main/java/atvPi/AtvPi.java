package atvPi;

import java.util.Scanner;
import java.util.ArrayList;



public class AtvPi {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        usuario user = new usuario();
        boolean logado = false;
        
        while (!logado) {
            logado = user.fazerLogin(scanner);
            if (!logado) {
                System.out.println("Pressione ENTER para tentar novamente...");
                scanner.nextLine();
            }
        }
        
        projeto pjt = new projeto("AURA","Sistema desenvolvido para apoiar a realizacao de revisoes sistematicas utilizando tecnicas "
                + "de Processamento de Linguagem Natural (PLN). Ele visa otimizar e automatizar etapas como busca, triagem e analise de "
                + "publicacoes cientificas, tornando o processo mais eficiente e inteligente.","Estudantes da Fatec de Registro","Oferecer uma "
                + "ferramenta tecnologica que auxilie os estudantes na conducao de revisoes sistematicas, reduzindo o esforco manual, "
                + "aumentando a precisao na selecao de artigos relevantes e promovendo a qualidade da producao cientifica academica."); 
        
        Ods odsTexto = new Ods("A Agenda 2030 da ONU, vigente de 2016 a 2030, estabelece 17 objetivos de Desenvolvimento Sustentavel (ODS) com 169 metas, abrangendo as dimensoes economica, social e ambiental, e requerendo acoes coordenadas de governos, sociedade civil, setor privado e cidadaos.",
                                 "A ODS 4 busca garantir o ensino inclusivo e equitativo, promovendo oportunidades de aprendizado ao longo da vida para todos. A educacao eh um direito humano fundamental, conforme o Artigo 26 da Declaracao Universal dos Direitos, e eh vista como uma ferramenta essencial para a transformacao social, conscientizacao e preparacao para os desafios do mundo modernop, garantindo igualdade de oportunidades.",
                                 "Ja a ODS 10 tem como meta a reducao das disparidades dentro e entre os paises. Ela promove a inclusao social, economica e politica e busca assegurar que todos tenham acesso igual a servicos essenciais como saude, educacao e emprego. A ODS 10 visa eliminar barreiras que impedem o pleno exercicio dos direitos humanos e o desenvolvimento, a aplicando-se a todos, independente de origem, genero, etnia ou condicao economica.");
        
        equipe.Equipe equipe = new equipe.Equipe();
          
        int opcao;
        do {
            System.out.println("\n===== MENU DO PROJETO INTEGRADOR =====");
            System.out.println("1 - Apresentacao do Projeto");
            System.out.println("2 - Mostrar ODS do projeto");
            System.out.println("3 - Cadastrar Equipe");
            System.out.println("4 - Mostrar Informacoes");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    pjt.exibir();
                    break;

                case 2:
                    odsTexto.exibir();
                    break;

                case 3:
                    equipe.cadastrarEquipe(scanner);
                    break;

                case 4:
                    System.out.println("\n--- Informacoes do Projeto ---");
                    System.out.println("Apresentacao: ");
                    pjt.exibir();
                    
                    System.out.println("ODS: ");
                    odsTexto.exibir();
                    
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
                    System.out.println("Opção invalida! Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}