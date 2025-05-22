

package com.mycompany.exercicio09;

import java.util.Scanner;


public class Exercicio09 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double n1, n2;
        System.out.println("Digite um numero: ");
        n1 = ler.nextDouble();
        System.out.println("Digite a porcentagem que voce quer do numero: ");
        n2 = ler.nextDouble();
        System.out.println("Este é o valor: "+ Porcentagem(n1, n2));
        
        
        
        
    }
    public static double Porcentagem(double n1, double n2){
        double resul = (n1*n2)/100;
        return resul;
        
        
        
    }
}
