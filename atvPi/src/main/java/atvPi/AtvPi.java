package atvPi;

import java.util.Scanner;

public class AtvPi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        usuario user = new usuario();
        boolean logado = false;

        // Login
        while (!logado) {
            logado = user.fazerLogin(scanner);
            if (!logado) {
                System.out.println("Pressione ENTER para tentar novamente...");
                scanner.nextLine();
            }
        }

        // Criando objetos do sistema
        projeto pjt = new projeto("AURA\n",
                "Sistema desenvolvido para apoiar a realizacao de revisoes sistematicas utilizando tecnicas\n "
                        + "de Processamento de Linguagem Natural (PLN). Ele visa otimizar e automatizar etapas como busca, triagem e analise de\n "
                        + "publicacoes cientificas, tornando o processo mais eficiente e inteligente.\n",
                "Estudantes da Fatec de Registro\n",
                "Oferecer uma\n "
                        + "ferramenta tecnologica que auxilie os estudantes na conducao de revisoes sistematicas, reduzindo o esforco manual,\n "
                        + "aumentando a precisao na selecao de artigos relevantes e promovendo a qualidade da producao cientifica academica.\n");

        Ods ods = new Ods("A Agenda 2030 da ONU, vigente de 2016 a 2030, estabelece 17 objetivos de Desenvolvimento Sustentavel (ODS) com 169 metas,\n"
                + " abrangendo as dimensoes economica, social e ambiental, e requerendo acoes coordenadas de governos, sociedade civil, setor privado e cidadaos.\n",
                "A ODS 4 busca garantir o ensino inclusivo e equitativo, promovendo oportunidades de aprendizado ao longo da vida para todos.\n"
                        + " A educacao eh um direito humano fundamental, conforme o Artigo 26 da Declaracao Universal dos Direitos,\n"
                        + " e eh vista como uma ferramenta essencial para a transformacao social, conscientizacao\n"
                        + " e preparacao para os desafios do mundo moderno, garantindo igualdade de oportunidades.\n",
                "Ja a ODS 10 tem como meta a reducao das disparidades dentro e entre os paises. Ela promove a inclusao social,\n"
                        + " economica e politica e busca assegurar que todos tenham acesso igual a servicos essenciais como saude, educacao e emprego.\n"
                        + " A ODS 10 visa eliminar barreiras que impedem o pleno exercicio dos direitos humanos e o desenvolvimento, a aplicando-se a todos,\n"
                        + " independente de origem, genero, etnia ou condicao economica.");

        equipe Equipe = new equipe();

        int opcao;
        do {
            System.out.println("\n===== MENU DO PROJETO INTEGRADOR =====");
            System.out.println("1 - Apresentação do Projeto");
            System.out.println("2 - ODS Relacionados");
            System.out.println("3 - Nossa Equipe");
            System.out.println("4 - Mostrar Informações completas do Projeto Integrador");
            System.out.println("5 - Adicionar novas informações");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    pjt.exibir();
                    break;

                case 2:
                    ods.exibir();
                    break;

                case 3:
                    Equipe.exibir();
                    break;

                case 4:
                    System.out.println("\n--- Informações do Projeto ---");
                    pjt.exibir();
                    ods.exibir();
                    Equipe.exibir();
                    break;

                case 5:
                    System.out.println("\nO que você deseja adicionar?");
                    System.out.println("1 - Nova descrição do projeto");
                    System.out.println("2 - Nova ODS");
                    System.out.println("3 - Novo membro da equipe");
                    System.out.print("Escolha: ");
                    int escolha = scanner.nextInt();
                    scanner.nextLine();

                    switch (escolha) {
                        case 1:
                            System.out.print("Digite a nova descrição: ");
                            String novaDescricao = scanner.nextLine();
                            pjt.adicionarDescricao(novaDescricao);
                            System.out.println("Descrição adicionada!");
                            break;
                        case 2:
                            System.out.print("Digite a nova ODS: ");
                            String novaOds = scanner.nextLine();
                            ods.adicionarODS(novaOds);
                            System.out.println("ODS adicionada!");
                            break;
                        case 3:
                            System.out.print("Digite o nome do novo membro: ");
                            String novoMembro = scanner.nextLine();
                            Equipe.adicionarMembro(novoMembro);
                            System.out.println("Membro adicionado!");
                            break;
                        default:
                            System.out.println("Opção inválida.");
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
