

package com.mycompany.exercicio08;

import java.util.Arrays;


public class Exercicio08 {

    public static void main(String[] args) {
        int[] vetor = {1,2,3,4,5};
        int inicio = 0;
        int fim = vetor.length - 1;
        System.out.println("Vetor normal: "+ Arrays.toString(vetor));
        System.out.println("Vetor invertido: "+ Invertido(vetor, inicio, fim, fim));
        
        
        
        
    }
    public static String Invertido(int[] vetor, int inicio, int fim, int temp){
         while (inicio < fim) {
            
            temp = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = temp;

            inicio++;
            fim--;
          
    }
         return Arrays.toString(vetor);
         
  }
}
