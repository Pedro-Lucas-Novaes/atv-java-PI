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

public class usuario {
    
    public boolean fazerLogin(Scanner scanner) {
        System.out.println("\n--- LOGIN DE ACESSO ---");
        
        System.out.print("Usuario: ");
        scanner.nextLine(); 
        
        System.out.print("Senha: ");
        scanner.nextLine();
        
        System.out.println("\nLogin realizado com sucesso! Bem-vindo(a).");
        return true; 
    }
}
//public class usuario {
//        private ArrayList<String> user = new ArrayList<>();
//
//        public void cadastrarUsuario(Scanner scanner) {
//            System.out.println("User: ");
//            scanner.nextLine();
//           
//                System.out.print("Senha: ");
//                user.add(scanner.nextLine());
//           
//        }
//
//        public ArrayList<String> getUser() {
//            return user;
//        }
//    }

