package atvPi;

import java.util.Scanner;

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

