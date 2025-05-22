

package com.mycompany.exercicio05;

import java.util.Scanner;


public class Exercicio05 {
//        Crie um método que calcule o fatorial de um número 
//        sem usar bibliotecas ou métodos prontos.
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1;
        System.out.println("Digite um numero: ");
        n1 = ler.nextInt();
        int resul = Fatorial(n1);
        System.out.println("O fatorial é: "+ resul);
        
        
        
        
    }
    public static int Fatorial(int n1){
        int n2 = 1;
        while(n1>0){
            n2*=n1;
            n1--;
        }
        return n2;
    }
}
