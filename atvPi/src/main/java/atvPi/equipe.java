/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atvPi;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author ender
 */
public class equipe {
    
        String[] membros = {
            "Pedro Lucas de Novaes Dutra",
            "Gabriela Pereira Lino",
            "Danieli Fiel Reis",
            "Beatriz Hermenegildo Egen"
            };

        public void exibir() {
            System.out.println("\nMembros da Equipe:");
            for(String membro : membros){
                System.out.println(membro);
            }
            
    }  
}