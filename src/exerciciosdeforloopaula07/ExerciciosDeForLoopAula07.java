package exerciciosdeforloopaula07;

import java.util.Scanner;

public class ExerciciosDeForLoopAula07 {

    public static void main(String[] args) {
        // ---------- EXERCICIO 01 ----------
        //Implemente em Java, um código que imprima na tela os números de 1 a 20, 
        //um abaixo do outro e depois imprima os mesmo números um ao lado do outro. 
        //Utilize o comando for.
        
        for (int i = 1; i<=20; i++){
            System.out.print(i + " ");
        }
        
        
        // ---------- EXERCICIO 02 ----------
        //Implemente em Java, um código que leia seis números e informe o 
        // maiorNumero entre eles. Utilize o comando for.
        
        Scanner input = new Scanner(System.in);
        int maiorNumero = 0;
        
        for (int r = 1; r <=6; r++) { // r de repetição
           
           System.out.println("Digite um número: ");
           int n = input.nextInt();
           
           if(n > maiorNumero) {
               maiorNumero = n;
               System.out.println("O maior número é: " + maiorNumero);
           } else {
               System.out.println("O maior número é: " + maiorNumero);
           }
        }
     
        
        
        
        // ---------- EXERCICIO 03 ----------
        //Implemente em Java, um código que imprima os números ímpares entre 
        //1 e 50.
        
        for(int i=1; i<=50;i++){
            if (i % 2 == 1) { //Resto da divisão por dois é igual a um
                System.out.println(i);
            }           
        }
    }
}
