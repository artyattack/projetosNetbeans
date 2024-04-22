/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1d18;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class Ex1d18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int res;
        
        System.out.println("quer que eu te conte um segredo? (0 - não, 1 - sim)");
        res = sc.nextInt();
        if(res == 1){
            System.out.println("meia noite eu te conto");
        }
        else {
            System.out.println("fica sem saber então");
        }
    }
    

    
}
