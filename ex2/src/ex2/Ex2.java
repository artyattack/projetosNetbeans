/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        
        int valor;
        String nome;
        double desconto, valorD;
        
        System.out.print("diga o nome do produto: ");
        nome = sc.next();
        
        System.out.print("diga o valor do produto: ");
        valor = sc.nextInt();
        
        desconto = valor * 0.1;
        valorD = valor - desconto;
        System.out.printf("o valor do produto %s com desconto será R$%.2f%n", nome, valorD);
        
}
