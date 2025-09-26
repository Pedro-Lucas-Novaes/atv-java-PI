/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atvPi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ender
 */
public class equipe {
    
    static class Equipe {
        private ArrayList<String> membros = new ArrayList<>();

        public void cadastrarEquipe(Scanner scanner) {
            System.out.println("Quantos membros a equipe possui?");
            int qtd = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < qtd; i++) {
                System.out.print("Digite o nome do membro #" + (i + 1) + ": ");
                membros.add(scanner.nextLine());
            }
        }

        public ArrayList<String> getMembros() {
            return membros;
        }
    }
}
