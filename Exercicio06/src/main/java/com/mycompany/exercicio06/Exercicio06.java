

package com.mycompany.exercicio06;

import java.util.Scanner;


public class Exercicio06 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String frase;
        System.out.println("Digite uma frase: ");
        frase= ler.nextLine();
        frase = frase.toLowerCase();
        System.out.println(StringInvertida(frase, frase));

        
    }
      public static String StringInvertida(String texto, String frase) {
        String resul;
        boolean verificação = true;
        if(texto == null){
            return texto;
        }
        
        String textoInvertido = "";
        for(int i = texto.length() - 1; i >= 0; i--){
            textoInvertido = textoInvertido + texto.charAt(i);
        }
        if(frase.equals(textoInvertido)){
            verificação = true;
            resul = "Essa frase é um palindromo";
        }else{
            verificação = false;
            resul = "Essa frase não é um palindromo";
        }
        return resul;
        
        
      }
}
