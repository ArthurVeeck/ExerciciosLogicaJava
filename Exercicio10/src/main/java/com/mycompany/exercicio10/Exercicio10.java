

package com.mycompany.exercicio10;


public class Exercicio10 {

    public static void main(String[] args) {
        int[] n1 = {0, 1, 2, 3, 4, 5, 8, 10, 13, 21, 22, 34};

        for (int n2 : n1) {
            if (Fibonacci(n2)) {
                System.out.println(n2 + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println(n2 + " NÃO pertence à sequência de Fibonacci.");
            }
        }
    }

    
    public static boolean Fibonacci(int n3) {
        int expressao1 = 5 * n3 * n3 + 4;
        int expressao2 = 5 * n3 * n3 - 4;

        int raiz1 = (int) Math.sqrt(expressao1);
        int raiz2 = (int) Math.sqrt(expressao2);

       
        return (raiz1 * raiz1 == expressao1) || (raiz2 * raiz2 == expressao2);
    }
}

