

package com.mycompany.exercicio03;

import java.util.Arrays;



public class Exercicio03 {

    public static void main(String[] args) {
//        Crie um método que receba um array de inteiros 
//        e retorne o maior valor absoluto presente no array.
         int[] vetor = {6, 29, 10, 5, 1};
         System.out.println(vetor[0]+" "+vetor[1]+" "+vetor[2]+" "+vetor[3]+" "+vetor[4]);
         int resul = Maior(vetor);
         System.out.println("O maior elemento é: "+ resul);
    }
    public static int Maior(int[] vetor){
         Arrays.sort(vetor);
        int Maiorzin = vetor[4];
        return Maiorzin;
    }
}
