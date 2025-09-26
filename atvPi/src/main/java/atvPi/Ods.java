package atvPi;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author ender
 */
public class Ods {
    private String agenda;
    private String quatro;
    private String dez;    
    
    public Ods (String agenda, String quatro, String dez){
    this.agenda = agenda;
    this.quatro = quatro;
    this.dez = dez;
    }
    
    public void exibir(){
    System.out.println("Agenda 2030 da ONU - " + this.agenda);
    System.out.println("ODS 4 - Educacao de Qualidade: " + this.quatro);
    System.out.println("ODS 10 - Reducao das Desigualdades:  " + this.dez);
    }
}
    
    
    
//    static class ODS {
//        private ArrayList<String> odsRelacionados = new ArrayList<>();
//
//        public void cadastrarODS(Scanner scanner) {
//            System.out.println("Quantos ODS deseja cadastrar?");
//            int qtd = scanner.nextInt();
//            scanner.nextLine();
//            for (int i = 0; i < qtd; i++) {
//                System.out.print("Digite o ODS #" + (i + 1) + ": ");
//                odsRelacionados.add(scanner.nextLine());
//            }
//        }
//
//        public ArrayList<String> getODSRelacionados() {
//            return odsRelacionados;
//        }
//    }


