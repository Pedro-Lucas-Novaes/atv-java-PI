/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atvPi;


import java.util.ArrayList;
import java.util.Scanner;        
/**
 *
 * @author fatec-dsm2
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