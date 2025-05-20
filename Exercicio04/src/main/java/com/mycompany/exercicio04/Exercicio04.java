

package com.mycompany.exercicio04;


public class Exercicio04 {

    public static void main(String[] args) {
         String nomes[] = {"arthur", "henrique"};
         System.out.println(nomes[0]+", "+nomes[1]);
         int contador1 = 0;
         int contador2 = 0;
         String resul = MaiorString(nomes, contador1, contador2);
         System.out.println("A String com mais vogais é: "+ MaiorString(nomes, contador1, contador2));
        
        
    }public static String MaiorString(String nomes[], int contador1, int contador2){
        for (int i = 0; i < nomes[0].length(); i++) {
            char caractere = nomes[0].charAt(i);

            
            if (caractere == 'a') {
                contador1++;
            } else if (caractere == 'e') {
                contador1++;
            } else if (caractere == 'i') {
                contador1++;
            } else if (caractere == 'o') {
                contador1++;
            } else if (caractere == 'u') {
                contador1++;
            }
        }
        for (int i = 0; i < nomes[1].length(); i++) {
            char caractere = nomes[1].charAt(i);

            
            if (caractere == 'a') {
                contador2++;
            } else if (caractere == 'e') {
                contador2++;
            } else if (caractere == 'i') {
                contador2++;
            } else if (caractere == 'o') {
                contador2++;
            } else if (caractere == 'u') {
                contador2++;
            }
        }        
            if(contador1 > contador2){
                return nomes[0];
            }else{
                return nomes[1];
            }
        
        
        
        
        }
        
        
    }
    
    
    
    
    
    
    
    

