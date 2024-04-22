/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2d18;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class Ex2d18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int x, y;
        
        System.out.println("digite um número: ");
        x = sc.nextInt();
        
        System.out.println("digite outro número: ");
        y = sc.nextInt();
        
        if(x > y){
            System.out.printf("o número %d é maior que %d%n", x, y);
        }
        else{
            System.out.printf("o número %d é maior que %d%n", y, x);
        }
        
    }
    
}
