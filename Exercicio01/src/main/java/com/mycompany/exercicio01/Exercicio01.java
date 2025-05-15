

package com.mycompany.exercicio01;

import java.util.Scanner;


public class Exercicio01 {
//Crie um método que receba um número inteiro e retorne true se 
//for um número perfeito (a soma de seus divisores próprios é igual ao número, ex: 6 = 1 + 2 + 3).
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite um numero: ");
        int n1 = ler.nextInt();
        int i = 0;
        boolean resul = Perfeito(n1, true, i, i);
        System.out.println("Seu numero é perfeito? "+ resul);
        
    }
    public static boolean Perfeito(int n1, boolean verificação, int i, int soma){
        while(n1<n1){
            soma = (n1+i);
            i++;
        }
        if(n1==n1){
            verificação = true;
  }else{
            verificação = false;
        
}
        return(verificação);
    }
}