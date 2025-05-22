

package com.mycompany.exercicio07;

import java.util.Scanner;


public class Exercicio07 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2;
        System.out.println("Digite o primeiro numero para o MDC: ");
        n1 = ler.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = ler.nextInt();
        System.out.println("O MDC desses numeros é: "+ MDC(n1, n2));
        
        
        
        
    }
    public static int MDC(int n1, int n2){
        boolean verificação = true;
        int calculo = (n1%n2);
        while(verificação == true){
            if(calculo!=0){
                calculo %= n2;
            }else{
                verificação = false;
            }
        }
        return n2;
        
    }
}
