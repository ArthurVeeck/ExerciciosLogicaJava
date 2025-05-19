

package com.mycompany.exercicio02;

import java.util.Scanner;


public class Exercicio02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String palavra;
        int i = 0;
        System.out.println("Digite uma palavra: ");
        palavra = ler.nextLine();
        System.out.println("Palavra com asteriscos: "+ Asteriscos(palavra, i));
        
        
        
    }
       public static String Asteriscos(String palavra, int i){
            String palavraComAsteriscos = "";
            do {
        char caracter = palavra.charAt(i);
            if (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U'){
            i++;   
            
        }
            palavraComAsteriscos = palavraComAsteriscos + "*";
            
        }while(i < palavra.length());

        return(palavraComAsteriscos);


           
           
           
           
   }
}
