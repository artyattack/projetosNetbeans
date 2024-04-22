/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int base, altura, area;
        
        System.out.println("Diga a base: ");
        base = sc.nextInt();
        
        System.out.println("Diga a altura: ");
        altura = sc.nextInt();
        
        area = base * altura/2;
        System.out.printf("a area é: %d%n", area);
    }
    
}
